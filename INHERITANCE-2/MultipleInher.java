//why Multiple level is not occur in java?
// Base class
// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Intermediate class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to test the inheritance
public class MultipleInher {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.eat();   // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Defined in Dog
    }
}
