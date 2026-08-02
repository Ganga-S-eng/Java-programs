package lab1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int rev = 0;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reversed = " + rev);
    }
}