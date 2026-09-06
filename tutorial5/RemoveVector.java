package tutorial5;
import java.util.Vector;

public class RemoveVector {
    public static void main(String[] args) {

        Vector<String> colors = new Vector<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove("Green");

        System.out.println("Final contents:");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}