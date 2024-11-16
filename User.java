// User.java
public class User extends Person {
    private int userID;

    public User(int userID, String name, String email) {
        super(name, email);
        this.userID = userID;
    }

    @Override
    public void displayDetails() {
        System.out.println("User ID: " + userID + ", Name: " + name + ", Email: " + email);
    }

    public int getUserID() {
        return userID;
    }
}
