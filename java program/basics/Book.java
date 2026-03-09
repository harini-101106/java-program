package basics;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int copies = scan.nextInt();
        int cost = scan.nextInt();
        int editing = scan.nextInt();
        int design = scan.nextInt();
        int commision = scan.nextInt();
        int marketing = scan.nextInt();
        int profit = (copies * cost) + editing + design - commision - marketing;
        System.out.println("Publishing Profit=" + profit);
        scan.close();
    }
}
