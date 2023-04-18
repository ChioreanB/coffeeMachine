package CoffeeMachine;
//in this project I used two design patterns: Builder Pattern and Chain of Responsibility Pattern


public class Main {
    public static void main(String[] args)
    {
        Coffee espresso = new Coffee.Builder(true)
                .build();

        Coffee cappuccino = new Coffee.Builder(true)
                .setMilk(true)
                .setSugar(1)
                .build();

        Coffee doubleEspresso = new Coffee.Builder(true)
                .setSugar(2)
                .build();

        // Coffee decaf = new Coffee.Builder(false)
        //        .build();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println("Making espresso: ");
        coffeeMachine.makeCoffee(espresso);

        System.out.println("Making cappuccino: ");
        coffeeMachine.makeCoffee(cappuccino);

        System.out.println("Making doubleEspresso");
        coffeeMachine.makeCoffee(doubleEspresso);

       // coffeeMachine.makeCoffee(decaf);
    }

}
