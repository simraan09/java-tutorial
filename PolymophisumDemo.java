public class PolymophisumDemo {
    public static void main(String[] args) {

        A obj = new A();
        obj.doPrint("B");
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public void doPrint() {
        System.out.println("A");
    }

    public void doPrint(String str) {
        System.out.println(str);
    }
}