// FoodPlatform.java
import java.util.ArrayList;
import java.util.Scanner;

public class FoodPlatform {
    private static ArrayList<FoodItem> foodItems = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Review> reviews = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add Food Items
        System.out.print("Enter number of food items to add: ");
        int numFoodItems = scanner.nextInt();
        for (int i = 0; i < numFoodItems; i++) {
            System.out.print("Enter Food ID: ");
            int foodID = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter Food Name: ");
            String foodName = scanner.nextLine();
            System.out.print("Enter Food Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            System.out.print("Enter Food Description: ");
            String description = scanner.nextLine();
            foodItems.add(new FoodItem(foodID, foodName, price, description));
        }

        // Add Users
        System.out.print("Enter number of users to add: ");
        int numUsers = scanner.nextInt();
        for (int i = 0; i < numUsers; i++) {
            System.out.print("Enter User ID: ");
            int userID = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter User Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter User Email: ");
            String email = scanner.nextLine();
            users.add(new User(userID, name, email));
        }

        // Place an Order
        System.out.print("Enter User ID to place an order: ");
        int userID = scanner.nextInt();
        double totalPrice = 0.0;
        System.out.print("Enter number of food items in the order: ");
        int numOrderItems = scanner.nextInt();
        for (int i = 0; i < numOrderItems; i++) {
            System.out.print("Enter Food ID for item " + (i + 1) + ": ");
            int foodID = scanner.nextInt();
            for (FoodItem foodItem : foodItems) {
                if (foodItem.getFoodID() == foodID) {
                    totalPrice += foodItem.getPrice();
                    break;
                }
            }
        }
        orders.add(new Order(1001, userID, totalPrice));
        System.out.println("Order ID: 1001 has been placed by User ID: " + userID + " with total price: " + totalPrice);

        // Submit a Review
        System.out.print("Enter Review ID: ");
        int reviewID = scanner.nextInt();
        System.out.print("Enter Food ID for Review: ");
        int reviewFoodID = scanner.nextInt();
        System.out.print("Enter User ID for Review: ");
        int reviewUserID = scanner.nextInt();
        System.out.print("Enter Rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Comment: ");
        String comment = scanner.nextLine();
        reviews.add(new Review(reviewID, reviewFoodID, reviewUserID, rating, comment));
        System.out.println("Review ID: " + reviewID + " submitted by User ID: " + reviewUserID +
                           " for Food ID: " + reviewFoodID + " with rating: " + rating + " and comment: " + comment);
    }
}
