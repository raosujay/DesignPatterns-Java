public class BuilderPatternDemo {

    public static void main(String[] args){
        Meal vegMeal = MealBuilder.prepareVegMeal();
        System.out.println("----------vegMeal---------");
        vegMeal.showItems();
        System.out.println("totalCost:￥"+vegMeal.getCost());
        System.out.println();

        Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
        System.out.println("----------nonVegMeal---------");
        nonVegMeal.showItems();
        System.out.println("totalCost:￥"+nonVegMeal.getCost());
        System.out.println();
    }
}
