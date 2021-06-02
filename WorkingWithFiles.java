import java.io.File;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\simra\\My Docs\\Java\\text.txt");

        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
