package models;

import java.util.ArrayList;
import java.util.List;

public class CollectionCenter {
    private String name;
    private String location;
    private int capacity;
    private String contactPerson;
    private String contactNumber;
    private List<FoodDonation> donations;

    public CollectionCenter(String name, String location, int capacity, String contactPerson, String contactNumber) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.donations = new ArrayList<>();
    }

    public void addDonation(FoodDonation donation) {
        donations.add(donation);
    }

    public void displayDonations() {
        System.out.println("Donations at Collection Center: " + name);
        System.out.println("--------------------------------------");
        for (FoodDonation donation : donations) {
            System.out.println("Donor Name: " + donation.getDonorName());
            System.out.println("Donation Date: " + donation.getDonationDate());
            System.out.println("Donation Description: " + donation.getDonationDescription());
            System.out.println("Quantity: " + donation.getQuantity());
            System.out.println("--------------------------------------");
        }
    }


}

