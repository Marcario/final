package models;

import java.time.LocalDateTime;

public class FoodPickupScheduler {
    private LocalDateTime pickupDateTime;
    private String pickupLocation;
    private String donorName;

    public FoodPickupScheduler(LocalDateTime pickupDateTime, String pickupLocation, String donorName) {
        this.pickupDateTime = pickupDateTime;
        this.pickupLocation = pickupLocation;
        this.donorName = donorName;
    }

    public LocalDateTime getPickupDateTime() {
        return pickupDateTime;
    }

    public void setPickupDateTime(LocalDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public void schedulePickup() {
        // Implementation for scheduling the pickup, such as notifying the food redistribution organization or pickup partner.
        System.out.println("Scheduled pickup for " + donorName + " at " + pickupLocation + " on " + pickupDateTime);
    }


}

