package operators;

import java.util.Scanner;

public class Movie_theatre {
    public static void main(String[] args) {
        Scanner access = new Scanner(System.in);
        int age = access.nextInt();
        int idProof = access.nextInt();
        String permission = (age >= 18 && idProof == 1) ? "Allowed" : "Denied";
        System.out.println(permission);
        access.close();
    }
}
