public class TempTable {
	public static void main(String[] args) {
		System.out.println("Fahrenheit to Celsius Table");
		System.out.println("---------------------------");
		System.out.printf("%12s %12s%n", "Fahrenheit", "Celsius");

		for (int f = 0; f <= 100; f += 10) {
			double c = (f - 32) * 5.0 / 9.0;
			System.out.printf("%12d %12.2f%n", f, c);
		}
	}
}

