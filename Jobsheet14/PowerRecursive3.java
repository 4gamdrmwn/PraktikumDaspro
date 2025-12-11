package Jobsheet14;

import java.util.Scanner;

public class PowerRecursive3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = sc.nextInt();
        System.out.print("Input Power Number: ");
        int pow = sc.nextInt();

        System.out.println("Result of "+base+" power "+pow+" = "+calculatePower(base, pow));
    }

    static int calculatePower(int base, int pow){
        if (pow == 0) { System.out.print("1"); return 1; }
        System.out.print(base + "x");
        int res = base * calculatePower(base, pow-1);
        return res;
    }
}