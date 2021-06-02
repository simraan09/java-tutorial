import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList<String> colors = new ArrayList<String>(10);
        // colors.add("Red");
        // colors.add("Blue");
        // colors.add("Green");

        // System.out.println(colors.size());

        LinkedList<Integer> l = new LinkedList<Integer>();

        l.add(10);
        l.add(12);
        l.add(14);

        for (Integer i : l) {
            System.out.println(i);
        }
    }
}
