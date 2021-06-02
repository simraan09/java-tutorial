import java.util.HashMap;
import java.util.HashSet;

// HashMap is used for storing data collections as key and value pairs
// A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap<String, Integer> age = new HashMap<String, Integer>();
        // age.put("John", 24);
        // age.put("Smith", 28);
        // age.put("Anne", 31);

        // System.out.println(age.get("John"));

        HashSet<Integer> marks = new HashSet<Integer>();
        marks.add(10);
        marks.add(10);
        marks.add(30);

        for (Integer i : marks) {
            System.out.println(i);
        }
    }
}
