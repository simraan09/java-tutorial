import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(15);
        list.add(30);
        list.add(90);
        list.add(150);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
