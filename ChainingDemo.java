public class ChainingDemo {
    static class Person {
        String name;
        int age;

        Person() {
            this("Unknown", 0);
        }

        Person(String name) {
            this(name, 0);
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class FluentCalculator {
        private double value;

        FluentCalculator(double start) {
            this.value = start;
        }

        FluentCalculator add(double n) {
            value += n;
            return this;
        }

        FluentCalculator multiply(double n) {
            value *= n;
            return this;
        }

        FluentCalculator subtract(double n) {
            value -= n;
            return this;
        }

        double result() {
            return value;
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Asha", 20);
        System.out.println("Constructor chaining -> " + p.name + ", " + p.age);

        double ans = new FluentCalculator(10)
                .add(5)
                .multiply(2)
                .subtract(4)
                .result();

        System.out.println("Method chaining result: " + ans);
    }
}
