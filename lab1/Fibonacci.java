package lab1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int a = 0, b = 1, count = 0;

        while (count < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}