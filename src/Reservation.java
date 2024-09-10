import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Reservation extends BaseObject {
    private Integer startDate;
    private Integer endDate;
    private Double price;
    private Guest guest;
    private Room room;

    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public Guest getGuest() {
        return guest;
    }
    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getEndDate() {
        return endDate;
    }
    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }
    public Integer getStartDate() {
        return startDate;
    }
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }
    public void fillStartDate() {
        System.out.println("Start date");
        Scanner scanner = new Scanner(System.in);
        startDate = scanner.nextInt();
    }
    public void fillEndDate() {
        System.out.println("End date");
        Scanner scanner = new Scanner(System.in);
        endDate = scanner.nextInt();
    }
    public void fillPrice() {
        System.out.println("Enter price");
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextDouble();
    }
    public void print() {
        System.out.print("ID:");
        System.out.println(getId());
        System.out.print("Start date:");
        System.out.println(startDate);
        System.out.print("End date");
        System.out.println(endDate);
        System.out.print("Price:");
        System.out.println(price);
    }

}
