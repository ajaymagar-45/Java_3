package Practise;
class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}



public class SafeDownCasting {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Downcasting
        Dog d = (Dog) a;
        d.bark();

    }
}
