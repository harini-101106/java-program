package operators;

import java.util.Scanner;

public class Digital_signal {
    public static void main(String[] args) {
        Scanner signal = new Scanner(System.in);
        int signalValue = signal.nextInt();
        int toggleMask = signal.nextInt();
        int result = (signalValue ^ toggleMask);
        System.out.println("Toggled Signal=" + result);
        signal.close();
    }
}
