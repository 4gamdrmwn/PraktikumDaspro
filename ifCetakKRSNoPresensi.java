import java.util.Scanner;
public class ifCetakKRSNoPresensi {
    // Class implementation goes here
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Print KRS SIAKAD");
            System.out.println("================");
            System.out.println("Have the tuition fee been paid? (true/false)");
            boolean uktLunas = scanner.nextBoolean();
            // Ternary operator: condition ? value_if_true : value_if_false
            // If uktLunas is true, message will be the first string. If false, message will be the second string.
            String message = uktLunas
                ? "UKT Payment has been confirmed.\nKRS now can be printed and you can ask the academic advisor to sign it."
                : "Registration rejected. Please pay UKT first.";
            System.out.println(message);

    }
}