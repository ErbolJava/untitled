public interface PhoneInterface {
    public String turnOn();

    public String call(int phoneNumber);
    public String call(String name);
    public  String searchContact(String name);
    public Contact updateName(String newName, String oldName);
    public String getAllContacts();

}
