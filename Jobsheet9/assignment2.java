package Jobsheet9;
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of orders: ");
        int numOrders = sc.nextInt();
        sc.nextLine(); 
        
        
        String[] orderNames = new String[numOrders];
        double[] orderPrices = new double[numOrders];
        
        // Input: Order details
        for (int i = 0; i < numOrders; i++) {
            System.out.print("Enter the name of order " + (i + 1) + ": ");
            orderNames[i] = sc.nextLine();
            System.out.print("Enter the price of order " + (i + 1) + ": Rp ");
            orderPrices[i] = sc.nextDouble();
            sc.nextLine();
        }
        
        double totalCost = 0;
        for (double price : orderPrices) {
            totalCost += price;
        }
        
        System.out.println("List of Orders:");
        for (int i = 0; i < numOrders; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - Rp" + orderPrices[i]);
        }
        System.out.println("Total Cost: Rp " + totalCost);
        
        sc.close();
    }
}