public class PowerCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <n>");
            return;
        }

        double x;
        int n;

        try {
            x = Double.parseDouble(args[0]);
            n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numeric values.");
            return;
        }

        double result = 1.0;
        int exponent = Math.abs(n);

        for (int i = 0; i < exponent; i++) {
            result *= x;
        }

        if (n < 0) {
            if (x == 0) {
                System.out.println("Undefined: 0 cannot be raised to a negative power.");
                return;
            }
            result = 1.0 / result;
        }

        System.out.println(x + "^" + n + " = " + result);
    }
}
