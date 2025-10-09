  package Jobsheet5;
import java.util.Scanner;   
public class switchCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print KRS SIAKAD");
        System.out.println("Enter current semester (1-8): ");
        int semester = scanner.nextInt();
        switch (semester) {
            case 1:
            System.out.println("KRS Semester 1 is displayed");
                
                break;
            case 2:
            System.out.println("KRS Semester 2 is displayed");
                break;
            case 3:
            System.out.println("KRS Semester 3 is displayed");
                break;
            case 4:
            System.out.println("KRS Semester 4 is displayed");
                break;
            case 5:
            System.out.println("KRS Semester 5 is displayed");
                break;
            case 6:
            System.out.println("KRS Semester 6 is displayed");
                break;
            case 7:
            System.out.println("KRS Semester 7 is displayed");
                break;
            case 8:
            System.out.println("KRS Semester 8 is displayed");
                break;
            default:
                System.out.println("Invalid semester input.");
                break;
                
        }
    }
}
