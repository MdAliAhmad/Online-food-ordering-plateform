// Review.java
public class Review {
    private int reviewID;
    private int foodID;
    private int userID;
    private int rating;
    private String comment;

    public Review(int reviewID, int foodID, int userID, int rating, String comment) {
        this.reviewID = reviewID;
        this.foodID = foodID;
        this.userID = userID;
        this.rating = rating;
        this.comment = comment;
    }

    public void displayReviewDetails() {
        System.out.println("Review ID: " + reviewID + ", Food ID: " + foodID + ", User ID: " + userID +
                           ", Rating: " + rating + ", Comment: " + comment);
    }
}
