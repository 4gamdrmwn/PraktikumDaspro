import java.util.Scanner;
public class ifCetakKRSNoPresensi {
    // Class implementation goes here
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Print KRS SIAKAD");
            System.out.println("================");
            System.out.println("Have the tuition fee been paid? (true/false)");
            boolean uktLunas = scanner.nextBoolean();
            if (uktLunas) {
                System.out.println("UKT Payment has been confirmed.");
                System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
            }
            else {
                System.out.println("Registration rejected. Please pay UKT first.");
            }
    }
}