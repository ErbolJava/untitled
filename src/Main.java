import java.util.Arrays;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact1 = new Contact("Erbol", 234234123);
        Contact contact2 = new Contact("Erbol1", 3125);
        Contact contact3 = new Contact("Erbol2", 32452345);
        Contact contact4 = new Contact("Erbol3", 745674);
        Contact contact5 = new Contact("Erbol4", 2562);
        Contact contact6 = new Contact("Erbol5", 234561);
        Contact[] contacts = {contact1, contact2, contact3, contact4, contact5, contact6};
        Phone phone = new Phone("Samsung", "fds", contacts, 23423);
        Phone[] phones = {phone};
        PhoneInterface phoneInterface = new PhoneInterface() {
            @Override
            public String turnOn() {
                for (Phone p : phones) {
                    int a = scanner.nextInt();
                    if (p.getPassword() == a) {
                        return "Successfully turned on";
                    }
                }
                return null;
            }

            @Override
            public String call(int phoneNumber) {
                for (Contact c : contacts) {
                    if (c.getPhoneNumber() == phoneNumber) {
                        return c.getPhoneNumber() + " " + c.getFullName();
                    }
                }
                return null;
            }



            @Override
            public String searchContact(String name) {
                for (Contact c:contacts) {
                    if(c.getFullName().equals(name)){
                        return c.getFullName()+" " +c.getPhoneNumber();
                    }
                }
                return null;
            }

            @Override
            public Contact updateName(String newName, String oldName) {

                return null;
            }

            @Override
            public String getAllContacts() {
                for (Contact c:contacts) {
                    return c.getFullName()+" "+c.getPhoneNumber()+"\n";
                }
                return null;
            }
            @Override
            public String call(String name) {
                for (Contact c:contacts) {
                    if (name.equals(c.getFullName())) {
                        return c.getFullName()+ " ushul adamga " + c.getPhoneNumber() + " ushul nomerge chalyp zhatasyz";
                    }
                }
                return null;
            }
        };


        System.out.println("""
                1-turnOn 2 - callWithPhoneNumber 3 - callWithName 4 - searchContact 5 - allContacts""");

        switch (scanner.nextInt()) {
            case 1 :
                System.out.println("password:");
                System.out.println(phoneInterface.turnOn());
                break;
            case 2 :
                System.out.println("phoneNumber");
                System.out.println(phoneInterface.call(scanner.nextInt()));
                break;
            case 3 :
                System.out.println("name: ");
                System.out.println(phoneInterface.call(scanner.next()));
                break;
            case 4 :
                System.out.println("Contact's name: ");
                System.out.println(phoneInterface.searchContact(scanner.next()));
            case 5 :
                System.out.println(phoneInterface.getAllContacts());
        }
    }
}