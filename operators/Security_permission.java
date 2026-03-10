package operators;

import java.util.Scanner;

public class Security_permission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int permissionA = sc.nextInt();
        int permissionB = sc.nextInt();
        int result = (permissionA | permissionB);
        System.out.println("Merged Permission Code=" + result);
        sc.close();
    }
}
