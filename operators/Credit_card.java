package operators;

import java.util.Scanner;

public class Credit_card {
    public static void main(String[] args) {
        Scanner credit = new Scanner(System.in);
        int creditLimit = credit.nextInt();
        int purchaseAmount = credit.nextInt();
        int creditBlocked = credit.nextInt();
        String result = (purchaseAmount <= creditLimit && creditBlocked == 0) ? "Approved" : "Decline";
        System.out.println(result);
        credit.close();
    }
}
