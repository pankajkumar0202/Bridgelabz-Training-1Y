class InvalidAgeException extends Exception {
    public InvalidAgeException(String msge) {
        super(msge);
    }
}

public class CustomException {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException exp) {
            System.out.println(e.getMessage());
        }
    }
}
