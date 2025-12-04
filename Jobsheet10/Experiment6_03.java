package Jobsheet10;
import java.util.Scanner;

public class Experiment6_03 {
    static int calculateArea (int l, int w) {
        int area = l * w;
        return area;
    }
    static int calculateVolume (int l, int w, int h) {
        int vol = calculateArea(l, w)*h;
        return vol;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int p, l, t, L, vol;
    System.out.print("Input length = ");
    p = input.nextInt();
    System.out.print("Input width = ");
    l = input.nextInt();
    System.out.print("Input height = ");
    t = input.nextInt();
    L = p * l;
    System.out.println("Area of the rectangle = " + L);
    vol = L * t;
    System.out.println("Volume of the cuboid = " + vol);

}
}