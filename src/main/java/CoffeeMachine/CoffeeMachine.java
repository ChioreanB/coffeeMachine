package CoffeeMachine;

public class CoffeeMachine
{
    private IngredientsHandler ingredient;

    public CoffeeMachine() {}
    public void makeCoffee(Coffee coffee)
    {
        this.ingredient = new IngredientsHandler(Ingredients.COFFEE);
        IngredientsHandler next;

        if (coffee.hasMilk())
        {
            next = ingredient.setNextHandler(new IngredientsHandler(Ingredients.MILK));
            if (coffee.hasSugar())
            {
                next.setNextHandler(new IngredientsHandler(Ingredients.SUGAR));
            }
        }
        else if (coffee.hasSugar())
        {
            ingredient.setNextHandler(new IngredientsHandler(Ingredients.SUGAR));
        }

        System.out.println("Coffee in progress...");
        ingredient.handleIngredient();

        System.out.println("Coffee is ready, enjoy!");
        System.out.println();
    }

}
