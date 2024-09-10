import java.util.Scanner;

public class Room extends BaseObject{
    private String name;
    private Integer number;
    private Double price;

    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void fillName() {
        System.out.println("Enter room name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
    }

    public void fillNumber() {
        System.out.println("Enter room number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    }
    public void fillPrice() {
        System.out.println("Enter price");
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextDouble();
    }

    public void print() {
        System.out.print("ID:");
        System.out.println(getId());
        System.out.print("Name:");
        System.out.println(name);
        System.out.print("Number:");
        System.out.println(number);
        System.out.print("Price:");
        System.out.println(price);
    }


}
