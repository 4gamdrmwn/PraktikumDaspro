package Jobsheet9;

public class arraynumber3 {
  public static void main(String[] args) {
        int[] num = new int[4];

        num[0] = 5;
        num[1] = 12;
        num[2] = 7;
        num[3] = 20;

        System.out.println("Array contents:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Element " + i + ": " + num[i]);
        }
    }
}