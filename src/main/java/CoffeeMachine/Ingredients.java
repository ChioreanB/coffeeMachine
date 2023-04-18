package CoffeeMachine;

public enum Ingredients {
    COFFEE ("coffee"),
    MILK("milk"),
    SUGAR("sugar");

    String value;

    public String getValue() {
        return value;
    }

    Ingredients(String value)
    {
        this.value = value;
    }
}
