import java.util.Objects;
import java.util.Scanner;

public class NutritionalInfo {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String itemName = scnr.next();

        if (Objects.equals(itemName, "Water")) {
            System.out.println("Nutritional information per serving of Water:");
            System.out.println("  Fat: " + FoodItem.getFat());
            System.out.println("  Carbohydrates: " + FoodItem.getCarbs());
            System.out.println("  Protein: " + FoodItem.getProtein());
        } else {

        }

        double servings = scnr.nextDouble();
        System.out.println("Number of calories for " + servings + " serving(s): " + FoodItem.getCalories(4));
    }
}
