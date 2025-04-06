//import java.util.*;
//public class MyATM () {
//    public static void main(String[] args, int counter) {
//        Scanner input = new Scanner(System.in);
//        String firstName;
//        String lastName;
//        int pin;
//        String id;
//
//        System.out.print("""
//                1:Create
//                2:Close
//                3:Deposit
//                4:Withdraw
//                5:Balance
//                6:Transfer
//                7:Change PIN
//                8:Exit""");
//
//        System.out.print("Option: ");
//        int choice = input.nextInt();
//        input.nextLine();
//
//        if (choice == 8) {
//            System.out.println("Exiting ATM.");
//        } else if (choice == 1) {
//            System.out.print("First Name: ");
//            firstName = input.nextLine();
//            System.out.print("Last Name: ");
//            lastName = input.nextLine();
//            System.out.print("PIN: ");
//            pin = input.nextInt();
//            id = "ATM" + counter++;
//            System.out.println("Account created: " + id);
//        } else if (choice == 2) {
//            System.out.print("Account ID: ");
//            String id = input.nextLine();
//            System.out.print("PIN: ");
//            String pin = input.nextLine();
//            for (int count = 0; count < MyATM.size(); count++) {
//                MyATM account = MyATM.main(count);
//                if (account.getId().equals(id)) {
//                    if (account.validatePin(pin)) {
//                        if (choice == 2) {
//                            accounts.remove(count);
//                            System.out.println("Account closed.");
//
//                        } else if (choice == 3) {
//
//
//                        }
//                    }
//                }
