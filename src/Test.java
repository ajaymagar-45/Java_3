class Animal {
    Animal get() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog get() {
        System.out.println("k");// Covariant return type (more specific)
        return new Dog();
    }

    void bark() {
        System.out.println("Woof!");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal a2 = a.get();
        System.out.println(a2.getClass());
       // Calls Dog's get()

        Dog d = new Dog();
        Dog d2 = d.get();     // No casting needed
        d2.bark();



    }
}
