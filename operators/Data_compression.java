package operators;

import java.util.Scanner;

public class Data_compression {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        int fileSize = size.nextInt();
        int compressionCycles = size.nextInt();
        int sizes = fileSize >> compressionCycles;
        System.out.println("Compressed Size=" + sizes);
        size.close();
    }
}
