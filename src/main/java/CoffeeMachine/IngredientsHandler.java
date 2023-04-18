package CoffeeMachine;

//I created a ingredientsHandler that know how to handle every ingredient in the coffee recipe, using chain of responsibility.
public class IngredientsHandler {
    private final Ingredients ingredient;
    private IngredientsHandler next;

    public IngredientsHandler(Ingredients ingredient)
    {
        this.ingredient = ingredient;
    }

    public IngredientsHandler setNextHandler(IngredientsHandler ingredientsHandler)
    {
        this.next = ingredientsHandler;
        return ingredientsHandler;
    }

    public void handleIngredient()
    {
        System.out.println("Adding " + ingredient.getValue());
        if (next != null)
        {
            next.handleIngredient();
        }
    }
}
