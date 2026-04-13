public class MethodOverloadingDemo {
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("add(int, int): " + calculator.add(5, 7));
        System.out.println("add(double, double): " + calculator.add(5.5, 7.2));
        System.out.println("add(int, int, int): " + calculator.add(1, 2, 3));
    }
}
