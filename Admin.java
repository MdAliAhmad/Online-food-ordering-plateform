// Admin.java
public class Admin extends Person {
    private int adminID;

    public Admin(int adminID, String name, String email) {
        super(name, email);
        this.adminID = adminID;
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin ID: " + adminID + ", Name: " + name + ", Email: " + email);
    }
}
