#FoodieHub - Online Food Ordering Platform 🍕🍔
FoodieHub is a Java-based project that simulates an online food ordering platform. It demonstrates the use of all four pillars of Object-Oriented Programming (OOP) concepts: Abstraction, Encapsulation, Inheritance, and Polymorphism.

The system allows users to:
Add food items 🍴
Register users 👤
Place orders 🛒
Submit reviews ⭐

📋 Features
Food Management: Add food items with details like ID, name, price, and description.
User Management: Register users with unique IDs, names, and emails.
Order Processing: Place orders and calculate the total price.
Review System: Submit reviews with ratings and comments.
OOP Demonstration: Implements all key OOP principles.

🛠️ Technologies Used
Programming Language: Java (JDK 22)
IDE: Visual Studio Code or any Java-compatible IDE
OOP Concepts: Abstraction, Encapsulation, Inheritance, Polymorphism

📂 Project Structure
FoodieHub/
├── Admin.java          // Represents admin users
├── FoodItem.java       // Represents food items in the platform
├── FoodPlatform.java   // Main class (entry point)
├── Order.java          // Represents orders placed by users
├── Person.java         // Abstract class for shared properties
├── Review.java         // Represents user reviews for food items
└── User.java           // Represents platform users

🧑‍💻 Usage Instructions

Run the program and follow the prompts:
Add food items by entering their details (ID, name, price, description).
Add users by entering their unique ID, name, and email.
Place orders by selecting food items.
Submit reviews with ratings and comments.

Example Flow:
Add 2 food items: Pizza and Burger.
Add 1 user: Ali (email: ali@abc.com).
Place an order for Pizza and Burger.
Submit a review for Pizza with a 5-star rating.
🏗️ OOP Principles in Action
Abstraction:
Abstract class Person provides a base for User and Admin.

Encapsulation:
Private fields in classes like FoodItem and Order ensure data security.

Inheritance:
User and Admin inherit common properties and behaviors from Person.

Polymorphism:
displayDetails() is overridden in User and Admin to display specific details.

🌟 Example Output
Enter number of food items to add: 2
Enter Food ID: 101
Enter Food Name: Pizza
Enter Food Price: 200
Enter Food Description: Cheesy with toppings
Enter Food ID: 102
Enter Food Name: Burger
Enter Food Price: 100
Enter Food Description: Cheesy

Enter number of users to add: 1
Enter User ID: 1
Enter User Name: Ali
Enter User Email: ali@abc.com

Enter User ID to place an order: 1
Enter number of food items in the order: 2
Enter Food ID for item 1: 101
Enter Food ID for item 2: 102
Order ID: 1001 has been placed by User ID: 1 with total price: 300.0

Enter Review ID: 1
Enter Food ID for Review: 101
Enter User ID for Review: 1
Enter Rating (1-5): 5
Enter Comment: Amazing taste with extra cheese!

Review ID: 1 submitted by User ID: 1 for Food ID: 101 with rating: 5 and comment: Amazing taste with extra cheese!

🤝 Contributions
Contributions are welcome! Feel free to fork this repository, make changes, and submit a pull request. Ensure your code adheres to the coding standards and includes proper comments.


📧 Contact
If you have any questions or suggestions, feel free to reach out:

Name: MD ALI AHMAD
Email: aliahmadmi621@gmail.com

🌟 Happy Coding! 🎉
Let me know if you need further help with GitHub or anything else! 😊
