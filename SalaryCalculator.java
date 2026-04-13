public class SalaryCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SalaryCalculator <basicSalary> <grade>");
            return;
        }

        double basic;
        char grade;

        try {
            basic = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid basic salary. Enter a numeric value.");
            return;
        }

        if (basic < 0) {
            System.out.println("Basic salary cannot be negative.");
            return;
        }

        grade = Character.toUpperCase(args[1].charAt(0));

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double allowance;

        switch (grade) {
            case 'A':
                allowance = 1700;
                break;
            case 'B':
                allowance = 1500;
                break;
            case 'C':
                allowance = 1300;
                break;
            default:
                allowance = 1000;
        }

        double totalSalary = basic + hra + da + allowance;

        System.out.printf("Basic Salary : %.2f%n", basic);
        System.out.printf("HRA (20%%)    : %.2f%n", hra);
        System.out.printf("DA (10%%)     : %.2f%n", da);
        System.out.printf("Allowance    : %.2f%n", allowance);
        System.out.printf("Total Salary : %.2f%n", totalSalary);
    }
}
