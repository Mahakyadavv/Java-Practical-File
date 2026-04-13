class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above for voting.");
        }
        System.out.println("Valid age for voting.");
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("User-defined exception caught: " + e.getMessage());
        }
    }
}
