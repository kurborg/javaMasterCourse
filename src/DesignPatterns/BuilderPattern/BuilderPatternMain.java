public class BuilderPatternMain {
    
    public static void main(String[] args){

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal:\n");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal regMeal = mealBuilder.prepareRegMeal();
        System.out.println("\n\nReg Meal:\n");
        regMeal.showItems();
        System.out.println("Total Cost: " + regMeal.getCost());
    }
}
