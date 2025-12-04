package Jobsheet10;

public class Gratitude_03 {
    public static void sayThankyou() {
        System.out.println("Thank you for being the best teacher in the world. \n" + "You inspired me a love for learning and made me feel like I could ask you about anything.");

    }
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }
    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thankyou... wish you all the best!!";
        sayAdditionalGreetings(expression);
    }
}

