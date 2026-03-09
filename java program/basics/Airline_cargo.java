package basics;

import java.util.Scanner;

public class Airline_cargo {
    public static void main(String[] args) {
        Scanner cargo = new Scanner(System.in);
        int weight = cargo.nextInt();
        int rate = cargo.nextInt();
        int priority = cargo.nextInt();
        int insurance = cargo.nextInt();
        int handling = cargo.nextInt();
        int fuel = cargo.nextInt();
        int revenue = (weight * rate) + priority + insurance - handling - fuel;
        System.out.println("Cargo Revenue=" + revenue);
        cargo.close();
    }
}
