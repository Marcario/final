package models;

import java.util.ArrayList;
import java.util.List;

public class Communication {
    private List<String> emailNotifications;
    private List<String> smsAlerts;

    public Communication() {
        emailNotifications = new ArrayList<>();
        smsAlerts = new ArrayList<>();
    }

    public void sendEmailNotification(String recipient, String message) {
        String emailNotification = "To: " + recipient + "\nMessage: " + message;
        emailNotifications.add(emailNotification);
        System.out.println("Email notification sent to: " + recipient);
    }

    public void sendSMSAlert(String recipient, String message) {
        String smsAlert = "To: " + recipient + "\nMessage: " + message;
        smsAlerts.add(smsAlert);
        System.out.println("SMS alert sent to: " + recipient);
    }

    public List<String> getEmailNotifications() {
        return emailNotifications;
    }

    public List<String> getSmsAlerts() {
        return smsAlerts;
    }


}

