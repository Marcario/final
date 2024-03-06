//import models.*;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.List;
//import static java.lang.System.out;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create collection center
//        CollectionCenter center1 = new CollectionCenter("Center A", "123 Main Street", 100, "John Doe", "+1-555-123-4567");
//
//        // Create food donations
//        FoodDonation donation1 = new FoodDonation("John Smith", "john@example.com", "456 Elm St", "Canned goods", 50);
//        FoodDonation donation2 = new FoodDonation("Jane Johnson", "jane@example.com", "789 Oak St", "Dry pasta", 30);
//
//        // Add donations to the collection center
//        center1.addDonation(donation1);
//        center1.addDonation(donation2);
//
//        // Display donations at the collection center
//        center1.displayDonations();
//
////creating a new object for communication
//        Communication communicationModel = new Communication();
//
//        // Example usage
//        communicationModel.sendEmailNotification("tina4@gmail.com", "Thank you for your food donation!");
//        communicationModel.sendSMSAlert("+25674988300", "Food pickup reminder!");
//
//        // Print all email notifications
//        List<String> emailNotifications = communicationModel.getEmailNotifications();
//        System.out.println("Email Notifications:");
//        for (String emailNotification : emailNotifications) {
//            System.out.println(emailNotification);
//        }
//
//        // Print all SMS alerts
//        List<String> smsAlerts = communicationModel.getSmsAlerts();
//        System.out.println("SMS Alerts:");
//        for (String smsAlert : smsAlerts) {
//            System.out.println(smsAlert);
//        }
//
//        LocalDateTime pickupDateTime = LocalDateTime.now().plusDays(1); // Schedule pickup for tomorrow
//        String pickupLocation = "123 Main Street";
//        String donorName = "John Doe";
//
//        FoodPickupScheduler pickupScheduler = new FoodPickupScheduler(pickupDateTime, pickupLocation, donorName);
//        pickupScheduler.schedulePickup();
//    }
//// invoking function to load admin data from file to admin list
//        Administrator.loadAdminsFromFile("admins.txt");
//
//    // scanner object to get user input
//    Scanner scanner = new Scanner(System.in);
//
//    // function for login
//        Login.performLogin(scanner);
//}
//
//
//}
//
//
//
//
//
//
//
//
import models.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create collection center
        CollectionCenter center1 = new CollectionCenter("Center A", "123 Main Street", 100, "John Doe", "+1-555-123-4567");

        // Create food donations
        FoodDonation donation1 = new FoodDonation("John Smith", "john@example.com", "456 Elm St", "Canned goods", 50);
        FoodDonation donation2 = new FoodDonation("Jane Johnson", "jane@example.com", "789 Oak St", "Dry pasta", 30);

        // Add donations to the collection center
        center1.addDonation(donation1);
        center1.addDonation(donation2);

        // Display donations at the collection center
        center1.displayDonations();

        // Creating a new object for communication
        Communication communicationModel = new Communication();

        // Example usage
        communicationModel.sendEmailNotification("tina4@gmail.com", "Thank you for your food donation!");
        communicationModel.sendSMSAlert("+25674988300", "Food pickup reminder!");

        // Print all email notifications
        List<String> emailNotifications = communicationModel.getEmailNotifications();
        System.out.println("Email Notifications:");
        for (String emailNotification : emailNotifications) {
            System.out.println(emailNotification);
        }

        // Print all SMS alerts
        List<String> smsAlerts = communicationModel.getSmsAlerts();
        System.out.println("SMS Alerts:");
        for (String smsAlert : smsAlerts) {
            System.out.println(smsAlert);
        }

        LocalDateTime pickupDateTime = LocalDateTime.now().plusDays(1); // Schedule pickup for tomorrow
        String pickupLocation = "123 Main Street";
        String donorName = "John Doe";

        FoodPickupScheduler pickupScheduler = new FoodPickupScheduler(pickupDateTime, pickupLocation, donorName);
        pickupScheduler.schedulePickup();


    }
}
