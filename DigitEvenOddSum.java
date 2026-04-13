public class DigitEvenOddSum {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DigitEvenOddSum <number>");
            return;
        }

        long number;
        try {
            number = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer number.");
            return;
        }

        number = Math.abs(number);
        int evenSum = 0;
        int oddSum = 0;

        if (number == 0) {
            evenSum = 0;
            oddSum = 0;
        } else {
            while (number > 0) {
                int digit = (int) (number % 10);
                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                number /= 10;
            }
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits : " + oddSum);
    }
}
