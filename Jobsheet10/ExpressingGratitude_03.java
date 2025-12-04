package Jobsheet10;

import java.util.Scanner;

public class ExpressingGratitude_03 {
    public static String[] getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of the person you want to greet: ");
        String recipientName = input.nextLine();
        System.out.print("Input the additional greeting message: ");
        String additionalGreetings = input.nextLine();
        return new String[] { recipientName, additionalGreetings };
    }

    public static void sayThankyou(String name, String additional) {
        System.out.println("Thank you " + name + " for being the best teacher in the world.");
        System.out.println("You inspired me a love for learning and made me feel like I could ask you about anything.");
        if (additional != null && !additional.trim().isEmpty()) {
            System.out.println("Additional message: " + additional);
        }
    }

    public static void main(String[] args) {
        String[] data = getGreetingRecipient();
        String name = data[0];
        String additional = data[1];
        sayThankyou(name, additional);
    }
}
