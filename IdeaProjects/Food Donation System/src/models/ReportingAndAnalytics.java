package models;

import java.util.Map;

public class ReportingAndAnalytics {
    private Map<String, Integer> foodDonations; // Map of food items and their total quantities donated

    public ReportingAndAnalytics(Map<String, Integer> foodDonations) {
        this.foodDonations = foodDonations;
    }

    public void generateDonationReport() {
        System.out.println("Donation Report:");
        for (Map.Entry<String, Integer> entry : foodDonations.entrySet()) {
            String foodItem = entry.getKey();
            int totalQuantity = entry.getValue();
            System.out.println(foodItem + ": " + totalQuantity);
        }
    }

}
