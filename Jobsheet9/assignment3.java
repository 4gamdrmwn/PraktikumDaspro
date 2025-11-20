package Jobsheet9;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        
        System.out.print("Enter the name of the item to search for: ");
        String searchItem = sc.nextLine();
        
        boolean found = false;
        int index = 0;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchItem)) {  
                found = true;
                index = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("The item '" + searchItem + "' is available on the menu at position " + (index + 1) );
        } else {
            System.out.println("The item '" + searchItem + "' is not on the menu.");
        }
        
        sc.close();
    }
}
