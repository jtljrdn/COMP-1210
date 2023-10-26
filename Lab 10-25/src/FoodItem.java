public class FoodItem {
    private static String foodName;
    private static double gramsOfFat;
    private static double gramsOfCarbs;
    private static double gramsOfProtein;

    public FoodItem(){
        foodName = "Water";
        gramsOfFat = 0.0;
        gramsOfCarbs = 0.0;
        gramsOfProtein = 0.0;
    }
    public FoodItem(String foodName, double gramsOfFat, double gramsOfCarbs, double gramsOfProtein){
        FoodItem.foodName = foodName;
        FoodItem.gramsOfFat = gramsOfFat;
        FoodItem.gramsOfCarbs = gramsOfCarbs;
        FoodItem.gramsOfProtein = gramsOfProtein;
    }

    public static String getName(){
        return foodName;
    }
    public static double getFat(){
        return gramsOfFat;
    }

    public static double getCarbs(){
        return gramsOfCarbs;
    }

    public static double getProtein(){
        return gramsOfProtein;
    }
    public static double getCalories(double numServings){
        return ((gramsOfFat * 9) + (gramsOfCarbs * 4) + (gramsOfProtein * 4)) * numServings;
    }

    public void printInfo(){
        System.out.println("Nutritional information per serving of " + foodName + ":");
        System.out.printf("  Fat: %.2f g\n", gramsOfFat);
        System.out.printf("  Carbohydrates: %.2f g\n", gramsOfCarbs);
        System.out.printf("  Protein: %.2f g\n", gramsOfProtein);
    }
}
