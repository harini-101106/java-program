package operators;

import java.util.Scanner;

public class E_commerce {
    public static void main(String[] args) {
        Scanner shipping = new Scanner(System.in);
        int cartValue = shipping.nextInt();
        int premiumMember = shipping.nextInt();
        String status = (cartValue > 999 || premiumMember == 1) ? "Free Shipping" : "Charges Applied";
        System.out.println(status);
        shipping.close();
    }
}
