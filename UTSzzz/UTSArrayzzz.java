import java.util.Scanner;

public class UTSArrayzzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seller = {"Sito", "Semi", "Risma", "Vero", "Barri"};
        String[] months = {"Jan", "Feb", "Maret", "April"};

        int[][] sales = {
            {2, 3, 4, 6},
            {3, 3, 3, 2},
            {4, 4, 5, 5},
            {1, 3, 3, 8},
            {2, 2, 2, 2} 
        };

        int bycprice = 1000000;
        int discount = (int) (bycprice - (bycprice * 0.05)); 

        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Rekap Penjualan");
            System.out.println("2. Tampilkan Total penjualan perbulan");
            System.out.print("pilih menu: ");
            
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.printf("%-10s", ""); // diatas nama
                    for (String month : months) {
                        System.out.printf("%-12s", month);
                    }
                    System.out.println();

                    for (int i = 0; i < seller.length; i++) {
                        System.out.printf("%-10s", seller[i]);
                        for (int j = 0; j < months.length; j++) {
                            int price = (j == 1) ? discount : bycprice;
                            int total = sales[i][j] * price;
                            System.out.printf("%-12d", total);
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Total penjualan tiap bulan:");
                    for (int j = 0; j < months.length; j++) {
                        int monthTotal = 0;
                        int price = (j == 1) ? discount : bycprice;

                        for (int i = 0; i < seller.length; i++) {
                            monthTotal += sales[i][j] * price;
                        }
                        System.out.printf("%-10s: %d\n", months[j], monthTotal);
                    }
                    break;

                default:
                    running = false;
                    System.out.println("Keluarrrrrr......");
                    break;
            }
        }
        sc.close();
    }
}