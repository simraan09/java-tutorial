public class ExceptionDemo {
    public static void main(String[] args) {
        // int[] arr = { 1, 2 };
        // try {
        // System.out.println(arr[5]);
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        try {
            System.out.println(div(10, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static double div(int x, int y) throws ArithmeticException {
        if (y == 0)
            throw new ArithmeticException("Invalid number");
        else
            return (double) x / y;
    }
}
