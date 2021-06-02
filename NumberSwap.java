public class NumberSwap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        // print a = 20 and b = 10
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
