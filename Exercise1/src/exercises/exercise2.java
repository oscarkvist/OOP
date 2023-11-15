package exercises;

import upgBank.*;
import upgBankAccountHierarchy.*;
import upgEmployeeSystem.*;
import upgShape.*;
import upgShoppingCart.*;
import upgSocialProfile.*;
import upgHotel.*;
import upgStudent.*;
import upgVehicle.*;


public class exercise2 {
    public static void upgSocialProfile() {
        SocialMediaProfile user1 = new SocialMediaProfile("user1", "John Doe");
        SocialMediaProfile user2 = new SocialMediaProfile("user2", "Jane Smith");
        user1.createPost("Hello, everyone!");
        user2.createPost("Excited to join this platform!");
        user1.followProfile(user2);
        user1.createPost("Just had a great day!");
        user2.createPost("Exploring new places today!");
        user1.displayProfileInfo();
        user2.displayProfileInfo();
    }

    public static void upgStudent() {
        Student student1 = new Student("John Doe", "123456");
        Student student2 = new Student("Jane Smith", "987654");
        Course mathCourse = new Course("MATH101", "Introduction to Mathematics");
        Course programmingCourse = new Course("CS101", "Introduction to Programming");
        student1.enrollCourse(mathCourse);
        student1.enrollCourse(programmingCourse);
        student2.enrollCourse(programmingCourse);
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        mathCourse.displayCourseInfo();
        programmingCourse.displayCourseInfo();
    }

    public static void upgShoppingCart() {
        Product product1 = new Product("Laptop", 8000.0);
        Product product2 = new Product("Phone", 4000.0);
        Product product3 = new Product("Headphones", 500.0);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);
        cart.addProduct(product3, 3);
        cart.removeProduct(product1);
        cart.displayCartContents();
    }

    public static void upgBank() {
        BankAccount account1 = new BankAccount("123456789", "Lisa Nilsson");
        account1.deposit(1000, "SEK");
        account1.displayAccountInfo();
        BankAccount account2 = new BankAccount("987654321", "Lars Andersson");
        account2.deposit(1500, "SEK");
        account2.withdraw(500, "SEK");
        account2.displayAccountInfo();
        BankAccount account3 = new BankAccount("555555555", "Laban Karlsson");
        account3.deposit(2000, "SEK");
        account3.withdraw(3000, "SEK");
        account3.displayAccountInfo();
        BankAccount accountM = new BankAccount("123456789", "Lina Olsson");
        accountM.deposit(1000, "SEK");
        accountM.deposit(50, "USD");
        accountM.withdraw(200, "EURO");
        accountM.displayAccountInfo();
        BankAccount accountN = new BankAccount("999999999", "Maria Oskarsson");
        accountN.deposit(300, "USD");
        accountN.displayAccountInfo();

    }

    public static void upgHotel() {
        Hotel hotel = new Hotel("Luxury Hotel");
        hotel.addRoom(new Room(101, "Single", 100.0));
        hotel.addRoom(new Room(102, "Double", 150.0));
        hotel.addRoom(new Room(201, "Double", 160.0));
        hotel.addRoom(new Room(301, "Suite", 250.0));
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        customer1.bookRoom(hotel, 101);
        customer2.bookRoom(hotel, 201);
        customer1.bookRoom(hotel, 102);
        hotel.displayRoomAvailability();
        customer1.displayReservations();
        customer2.displayReservations();

    }

    public static void upgVehicle() {
        Vehicle car = new Car("Toyota", "Camry", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, "V-Twin");
        Vehicle truck = new Truck("Ford", "F-150", 2023, 8000.0);
        car.displayInfo();
        motorcycle.displayInfo();
        truck.displayInfo();
    }

    public static void upgEmployeeSystem() {
        Employee alice = new Manager("Alice", "M101", 50000.0, 1000.0);
        Employee bob = new Worker("Bob", "W202", 25000.0, 160);
        alice.displayInfo();
        System.out.println();
        bob.displayInfo();

    }

    public static void upgBankAccountHierarchy() {
        SavingsAccount savingsAccount = new SavingsAccount("12345", "Alice", 1000.0);
        CheckingAccount checkingAccount = new CheckingAccount("67890", "Bob", 500.0);
        savingsAccount.deposit(200.0);
        savingsAccount.applyInterest();
        savingsAccount.displayInfo();
        checkingAccount.withdraw(700.0);
        checkingAccount.withdraw(100.0);
        checkingAccount.displayInfo();
    }


    public static void upgShape() {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    public static void displayShapeInfo(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        shape.displayDimensions();
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();

    }
}




