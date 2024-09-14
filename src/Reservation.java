import com.sun.source.tree.BreakTree;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reservation extends BaseObject {
    private Date startDate;
    private Date endDate;
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
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public void fillStartDate() {
        System.out.println("Start date");
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate = dateFormat.parse(scanner.next());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void fillEndDate() {
        System.out.println("End date");
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            endDate = dateFormat.parse(scanner.next());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
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
        System.out.print("End date:");
        System.out.println(endDate);
        System.out.print("Price:");
        System.out.println(price);
    }

}
