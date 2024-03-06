package models;

import java.util.Date;

public class FoodDonation {
    private String donorName;
    private String donorEmail;
    private String donorAddress;
    private String donationDescription;
    private double quantity;
    private Date donationDate;

    public FoodDonation(String donorName, String donorEmail, String donorAddress, String donationDescription, double quantity) {
        this.donorName = donorName;
        this.donorEmail = donorEmail;
        this.donorAddress = donorAddress;
        this.donationDescription = donationDescription;
        this.quantity = quantity;
        this.donationDate = new Date();
    }

    public String getDonorName() {
        return donorName;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public String getDonationDescription() {
        return donationDescription;
    }

    public double getQuantity() {
        return quantity;
    }

    public Date getDonationDate() {
        return donationDate;
    }
}

