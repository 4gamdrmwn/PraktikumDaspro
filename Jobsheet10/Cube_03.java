package Jobsheet10;

import java.util.Scanner;

public class Cube_03 {
    private static final int FACES = 6;

    static int calculateSurfaceArea(int side) {
        return FACES * side * side;
    }

    static int calculateVolume(int side) {
        return side * side * side;
    }

    private static int readSideLength(Scanner scanner) {
        System.out.print("Input cube side length: ");
        return scanner.nextInt();
    }

    private static void printResults(int side) {
        System.out.println("Cube Surface Area: " + calculateSurfaceArea(side));
        System.out.println("Cube Volume: " + calculateVolume(side));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = readSideLength(scanner);

        printResults(side);

        scanner.close();
    }
}