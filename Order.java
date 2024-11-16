// Order.java
public class Order {
    private int orderID;
    private int userID;
    private double totalPrice;

    public Order(int orderID, int userID, double totalPrice) {
        this.orderID = orderID;
        this.userID = userID;
        this.totalPrice = totalPrice;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID + ", User ID: " + userID + ", Total Price: " + totalPrice);
    }
}
