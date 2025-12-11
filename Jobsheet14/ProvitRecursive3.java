package Jobsheet14;

import java.util.Scanner;

public class ProvitRecursive3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Balance: ");
        int initialBalance = sc.nextInt();
        System.out.print("Input Investment period: ");
        int investPeriod = sc.nextInt();

        System.out.println("Balance After "+investPeriod+" year = "+calculateProfit(initialBalance, investPeriod));
    }

    static double calculateProfit(double balance, int period){
        if (period==0) {
            return balance;
        }else{
            return 1.11*calculateProfit(balance, period-1);
        }
    }
}