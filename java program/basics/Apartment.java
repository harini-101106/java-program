package basics;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner collection = new Scanner(System.in);
        int maintenance = collection.nextInt();
        int parking = collection.nextInt();
        int hall = collection.nextInt();
        int security = collection.nextInt();
        int eletricity = collection.nextInt();
        int cleaning = collection.nextInt();
        int balance = maintenance + parking + hall - security - eletricity - cleaning;
        System.out.println("Remaining Balance=" + balance);
        collection.close();
    }
}
