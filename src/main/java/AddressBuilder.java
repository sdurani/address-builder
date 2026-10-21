import java.util.Scanner;

public class AddressBuilder {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide the following information: ");
        System.out.println("Full name: ");
        String userFullName = read.nextLine();
        System.out.println("Billing Street: ");
        String userBillingStreet = read.nextLine();
        System.out.println("Billing City: ");
        String userBillingCity = read.nextLine();
        System.out.println("Billing State: ");
        String userBillingState = read.nextLine();
        System.out.println("Billing Zip: ");
        String userBillingZip = read.nextLine();

        System.out.println("\nShipping Street: ");
        String userShippingStreet = read.nextLine();
        System.out.println("Shipping City: ");
        String userShippingCity = read.nextLine();
        System.out.println("Shipping State: ");
        String userShippingState = read.nextLine();
        System.out.println("Shipping Zip: ");
        String userShippingZip = read.nextLine();

        StringBuilder customerInfo = new StringBuilder();


        customerInfo.append("\n\n" + userFullName + "\n\n");
        customerInfo.append("Billing Address:\n");
        customerInfo.append(userBillingStreet + "\n");
        customerInfo.append(userBillingCity  + ", " + userBillingState + " " + userBillingZip + "\n\n");

        customerInfo.append("Shipping Address:\n");
        customerInfo.append(userShippingStreet + "\n");
        customerInfo.append(userShippingCity + ", " + userShippingState + " " + userShippingZip);

// Display customer information
        System.out.println(customerInfo);
    }


}
