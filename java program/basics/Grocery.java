package basics;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        float discount = sc.nextFloat();
        float gst = sc.nextFloat();
        float discountPercentage = sales - (sales * discount / 100);
        float finalRevenue = discountPercentage + (discountPercentage * gst / 100);
        System.out.println("Final Revenue=" + finalRevenue);
        sc.close();
    }
}
