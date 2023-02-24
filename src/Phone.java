import java.util.Arrays;

public class Phone  {
    private String brand;
    private String name;
    private int password;
    private Contact [] contacts;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }


    public Phone(String brand, String name, Contact [] contacts, int password) {
        this.brand = brand;
        this.name = name;
        this.password = password;
         this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
