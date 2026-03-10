package operators;

import java.util.Scanner;

public class System_login {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        int usernameMatch = login.nextInt();
        int passwordMatch = login.nextInt();
        int accountLocked = login.nextInt();
        String status = ((usernameMatch == 1 && passwordMatch == 1) && accountLocked != 1) ? "Success" : "Failed";
        System.out.println(status);
        login.close();
    }
}
