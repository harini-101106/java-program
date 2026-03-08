package basics;

import java.util.Scanner;

public class Hotel_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int price = sc.nextInt();
        int serviceCharges = sc.nextInt();
        int commision = sc.nextInt();
        int Revenue = (rooms * price) + serviceCharges - commision;
        System.out.println("Total Revenue=" + Revenue);
        sc.close();
    }
}
