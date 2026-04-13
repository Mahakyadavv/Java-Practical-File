public class EvenSumCLI {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java EvenSumCLI <N>");
			return;
		}

		int n;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Please provide a valid integer for N.");
			return;
		}

		if (n < 1) {
			System.out.println("Please provide N >= 1.");
			return;
		}

		int sum = 0;
		for (int i = 2; i <= n; i += 2) {
			sum += i;
		}

		System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
	}
}

