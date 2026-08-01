package tutorial4;
import java.util.Scanner;

public class Marks {
    int mark1, mark2, mark3;

    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculate() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        Marks m = new Marks(m1, m2, m3);
        m.calculate();
    }
}
