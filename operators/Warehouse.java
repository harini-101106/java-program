package operators;

import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        int baseBoxes = box.nextInt();
        int levels = box.nextInt();
        int capacity = baseBoxes << levels;
        System.out.println("Total Capacity=" + capacity);
        box.close();
    }
}
