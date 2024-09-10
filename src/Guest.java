import java.util.Scanner;

public class Guest extends BaseObject {
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void fillName() {
        System.out.println("Enter guest name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
    }

    public void fillAddress() {
        System.out.println("Enter guest address");
        Scanner scanner = new Scanner(System.in);
        address = scanner.next();
    }

    public void print() {
        System.out.print("ID:");
        System.out.println(getId());
        System.out.print("Name:");
        System.out.println(name);
        System.out.print("Address:");
        System.out.println(address);
    }
}
