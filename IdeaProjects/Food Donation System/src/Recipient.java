public class Recipient {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;

    public Recipient(String firstName, String lastName, String address, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

    public void printRecipient() {
        System.out.println("First Name: " + firstName + "  Last Name: " + lastName + "  Address: " + address + "  Contact: " + contact);
    }

    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
