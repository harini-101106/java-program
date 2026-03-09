package basics;

import java.util.Scanner;

public class Software {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int hours = obj.nextInt();
        int rate = obj.nextInt();
        int design = obj.nextInt();
        int testing = obj.nextInt();
        int advance = obj.nextInt();
        int projectCost = (hours * rate) + design + testing - advance;
        System.out.println("Final Project Cost=" + projectCost);
        obj.close();

    }
}