package CoffeeMachine;

//I used a subclass Builder which help us to create Coffee object with ingredients that we want.
public class Coffee {
    private boolean coffee;
    private boolean milk;
    private int sugar;

    private Coffee(Builder builder) {
        this.coffee = builder.coffee;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
    }

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSugar()
    {
        return (sugar > 0) ? true : false;
    }

    public static class Builder {
        private Boolean coffee;
        private boolean milk;
        private int sugar;

        public Builder(Boolean coffee)
        {
            if (coffee == false)
            {
                throw new RuntimeException("Must contain coffee.");
            }
            this.coffee = coffee;
        }

        public Builder setMilk(boolean milk)
        {
            this.milk = milk;
            return this;
        }

        public Builder setSugar(int sugarCantity)
        {
            this.sugar = sugarCantity;
            return this;

        }

        public Coffee build()
        {
            return new Coffee(this);
        }
    }


}
