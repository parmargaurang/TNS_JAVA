package register;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entery[] persons = new Entery[3];
        int count = 0;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Edit Entry");
            System.out.println("3. Display All Entries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    if (count < persons.length) {
                    	
                             System.out.println("Enter details for person " + (count + 1) + ":");
                             System.out.print("Name: ");
                             String name = scanner.nextLine();
                             System.out.print("Address: ");
                             String address = scanner.nextLine();
                             System.out.print("Telephone Number: ");
                             String telephoneNumber = scanner.nextLine();
                             System.out.print("Mobile Number: ");
                             String mobileNumber = scanner.nextLine();
                             System.out.print("Head of Family: ");
                             String headOfFamily = scanner.nextLine();
                             
                             String uniqueID;
                             boolean isUnique;

                             do {
                                 System.out.print("Unique ID: ");
                                 uniqueID = scanner.nextLine();
                                 isUnique = true;
                                 for (int j = 0; j < count; j++) {
                                     if (persons[j].uniqueID.equals(uniqueID)) {
                                         isUnique = false;
                                         System.out.println("You entered a duplicate unique ID. Please re-enter.");
                                         break;
                                     }
                                 }
                             } while (!isUnique);

                             persons[count] = new Entery(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                             count++;
                         }
                     else {
                        System.out.println("Entry list is full.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the unique ID of the entry to edit: ");
                    String uniqueID = scanner.nextLine();
                    editEntry(scanner, persons, uniqueID);
                    break;
                case 3:
                    displayEntries(persons);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void editEntry(Scanner scanner, Entery[] persons, String uniqueID) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].uniqueID==(uniqueID)) {
                System.out.println("Editing entry for Unique ID: " + uniqueID);
                System.out.print("New Name: ");
                String name = scanner.nextLine();
                System.out.print("New Address: ");
                String address = scanner.nextLine();
                System.out.print("New Telephone Number: ");
                String telephoneNumber = scanner.nextLine();
                System.out.print("New Mobile Number: ");
                String mobileNumber = scanner.nextLine();
                System.out.print("New Head of Family: ");
                String headOfFamily = scanner.nextLine();
                persons[i] = new Entery(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                return;
            }
        }
        System.out.println("Entry with Unique ID " + uniqueID + " not found.");
    }

    public static void displayEntries(Entery[] persons) {
        System.out.println("Entered details:");
        int i=0;
        while(true) {
            if (persons[i] != null) {
                System.out.println(persons[i]);
                i++;
            }
            else {
            	break;
            }
        }
    }
}
