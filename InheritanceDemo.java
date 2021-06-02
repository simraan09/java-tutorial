//  constructor of the superclass is called when the subclass is instantiated.

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.legs);
        d1.eat();
    }
}

class Dog extends Animal {
    public Dog() {
        legs = 4;
    }
}

class Animal {
    protected int legs;

    public void eat() {
        System.out.println("Animal can eat");
    }
}
