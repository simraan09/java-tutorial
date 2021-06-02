public class AbstractDemo implements MathInterface {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public double div(int a, int b) {
        return 1.0 * a / b;
    }

}
