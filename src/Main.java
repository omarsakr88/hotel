import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Room> roomList;
    static ArrayList<Guest> guestList;
    static ArrayList<Reservation> reservationList;
    static Scanner scanner;
    static boolean run;
    public static void main(String[] args) {
        roomList = new ArrayList<>();
        guestList = new ArrayList<>();
        reservationList = new ArrayList<>();
        scanner = new Scanner(System.in);
        run = true;
        while (run == true) {
            doOperation();
            System.out.println("");
        }
    }

    static void doOperation() {
        System.out.println("Select operation:");

        System.out.println("1:Exit");

        System.out.println("2:Room");

        System.out.println("3:Guest");

        System.out.println("4:Reservation");

        System.out.println("5:Print-All");

        String ans = scanner.next();
        if (ans.equals("1")) {
            run = false;
        }
        if (ans.equals("2")) {
            roomOperation();
        }
        if (ans.equals("3")) {
            guestOperation();
        }
        if (ans.equals("2")) {
            resevationOperation();
        }
        if (ans.equals("2")) {
            print();
        }
    }

    static void roomOperation() {
        System.out.println("Select operation:");
        System.out.println("1:Add");
        System.out.println("2:rename");
        System.out.println("3:remove");
        System.out.println("4:print");

        String ans = scanner.next();
        if (ans.equals("1")) {
            addRoom();
        }
        if (ans.equals("1")) {
            renameRoom();
        }
        if (ans.equals("1")) {
            removeRoom();
        }
        if (ans.equals("1")) {
            printRooms();
        }
    }
    static void guestOperation() {
        System.out.println("Select operation:");
        System.out.println("1:Add");
        System.out.println("2:rename");
        System.out.println("3:remove");
        System.out.println("4:print");

        String ans = scanner.next();
        if (ans.equals("1")) {
            addGuest();
        }
        if (ans.equals("1")) {
            renameGuest();
        }
        if (ans.equals("1")) {
            removeGuest();
        }
        if (ans.equals("1")) {
            printGuests();
        }
    }
    static void resevationOperation() {
        System.out.println("Select operation:");
        System.out.println("1:New");
        System.out.println("2:Modify");
        System.out.println("3:Delete");
        System.out.println("4:print");

        String ans = scanner.next();
        if (ans.equals("1")) {
            newReservation();
        }
        if (ans.equals("2")) {
            modifyReservation();
        }
        if (ans.equals("3")) {
            deleteReservation();
        }
        if (ans.equals("4")) {
            printReservations();
        }
    }

    static void addRoom() {
        Room room = new Room();
        room.assignNewId();
        room.fillName();
        room.fillNumber();
        room.fillPrice();
        roomList.add(room);
    }
    static void renameRoom() {
        printRooms();
        Room room = getRoom();
        if (room == null) {
            return;
        }
        room.fillName();
        room.fillNumber();
        room.fillPrice();
    }
    static void removeRoom() {
        printRooms();
        Room room = getRoom();
        if (room == null) {
            return;
        }
        roomList.remove(room);
    }

    static void addGuest() {
        Guest guest = new Guest();
        guest.assignNewId();
        guest.fillName();
        guest.fillAddress();
        guestList.add(guest);
    }
    static void renameGuest() {
        printGuests();
        Guest guest = getGuest();
        if (guest == null) {
            return;
        }
        guest.fillName();
        guest.fillAddress();
    }
    static void removeGuest() {
        printGuests();
        Guest guest = getGuest();
        if (guest == null) {
            return;
        }
        guestList.remove(guest);
    }

    static void newReservation() {
        Reservation reservation = new Reservation();
        reservation.assignNewId();
        printGuests();
        Guest guest = getGuest();
        if (guest == null) {
            return;
        }
        printRooms();
        Room room = getRoom();
        if (room == null) {
            return;
        }
        reservation.setRoom(room);
        reservation.setGuest(guest);
        reservation.fillStartDate();
        reservation.fillEndDate();
        reservation.fillPrice();
        reservationList.add(reservation);
    }
    static void modifyReservation() {
        printReservations();
        Reservation reservation = getReservation();
        if (reservation == null) {
            return;
        }
        reservation.fillStartDate();
        reservation.fillEndDate();
        reservation.fillPrice();
    }
    static void deleteReservation() {
        printReservations();
        Reservation reservation = getReservation();
        if (reservation == null) {
            return;
        }
        reservationList.remove(reservation);
    }

    static void print() {
        printRooms();
        printGuests();
        printReservations();
    }
    static void printRooms() {
        System.out.println("Rooms:");
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            room.print();
        }
    }
    static void printGuests() {
        System.out.println("Guests:");
        for (int i = 0; i < guestList.size(); i++) {
            Guest guest = guestList.get(i);
            guest.print();
        }
    }
    static void printReservations() {
        System.out.println("Reservations:");
        for (int i = 0; i < reservationList.size(); i++) {
            Reservation reservation = reservationList.get(i);
            reservation.print();
        }
    }

    static Room getRoom() {
        System.out.println("Enter room ID:");
        Integer roomId = scanner.nextInt();
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room.getId().equals(roomId)) {
                return room;
            }
        }
        System.out.println("Room not found");
        return null;
    }
    static Guest getGuest() {
        System.out.println("Enter guest ID:");
        Integer guestId = scanner.nextInt();
        for (int i = 0; i < guestList.size(); i++) {
            Guest guest = guestList.get(i);
            if (guest.getId().equals(guestId)) {
                return guest;
            }
        }
        System.out.println("Guest not found");
        return null;
    }
    static Reservation getReservation() {
        System.out.println("Enter reservation ID:");
        Integer reservationId = scanner.nextInt();
        for (int i = 0; i < reservationList.size(); i++) {
            Reservation reservation = reservationList.get(i);
            if (reservation.getId().equals(reservationId)) {
                return reservation;
            }
        }
        System.out.println("Reservation not found");
        return null;
    }

}
