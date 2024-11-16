// FoodItem.java
public class FoodItem {
    private int foodID;
    private String name;
    private double price;
    private String description;

    public FoodItem(int foodID, String name, double price, String description) {
        this.foodID = foodID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getFoodID() {
        return foodID;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Food ID: " + foodID + ", Name: " + name + ", Price: " + price + ", Description: " + description);
    }
}
