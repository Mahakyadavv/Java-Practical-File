public class InheritanceDemo {
    static class Animal {
        void eat() {
            System.out.println("Animal eats");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    static class Vehicle {
        void run() {
            System.out.println("Vehicle runs");
        }
    }

    static class Car extends Vehicle {
        void wheels() {
            System.out.println("Car has 4 wheels");
        }
    }

    static class SportsCar extends Car {
        void speed() {
            System.out.println("SportsCar is fast");
        }
    }

    static class Shape {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing rectangle");
        }
    }

    public static void main(String[] args) {
        System.out.println("Single inheritance:");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println("\nMultilevel inheritance:");
        SportsCar sportsCar = new SportsCar();
        sportsCar.run();
        sportsCar.wheels();
        sportsCar.speed();

        System.out.println("\nHierarchical inheritance:");
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}
