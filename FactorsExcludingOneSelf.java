public class FactorsExcludingOneSelf {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FactorsExcludingOneSelf <number>");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer number.");
            return;
        }

        if (n <= 2) {
            System.out.println("No factors excluding 1 and itself for " + n);
            return;
        }

        System.out.println("Factors of " + n + " (excluding 1 and itself):");
        boolean found = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None (number is prime)");
        }

        System.out.println();
    }
}
