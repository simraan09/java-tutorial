import java.util.ArrayList;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('A');
        letters.add('D');
        letters.add('E');
        letters.add('H');
        letters.add('L');

        Collections.sort(letters);
        System.out.println(letters);
    }
}
