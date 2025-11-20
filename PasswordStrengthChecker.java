import java.util.Scanner;

public class PasswordStrengthChecker {

    // Check for minimum length
    public static boolean hasMinLength(String password) {
        return password.length() >= 8;
    }

    // Check for uppercase
    public static boolean hasUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    // Check for lowercase
    public static boolean hasLowercase(String password) {
        return password.matches(".*[a-z].*");
    }

    // Check for numbers
    public static boolean hasNumber(String password) {
        return password.matches(".*[0-9].*");
    }

    // Check for special characters
    public static boolean hasSpecialChar(String password) {
        return password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    // Determine strength based on checks
    public static String calculateStrength(String password) {
        int score = 0;

        if (hasMinLength(password)) score++;
        if (hasUppercase(password)) score++;
        if (hasLowercase(password)) score++;
        if (hasNumber(password)) score++;
        if (hasSpecialChar(password)) score++;

        if (score <= 2) return "Weak";
        else if (score == 3 || score == 4) return "Moderate";
        else return "Strong";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password to check its strength: ");
        String password = sc.nextLine();

        System.out.println("\n===== Password Analysis =====");
        System.out.println("Length (>=8): " + hasMinLength(password));
        System.out.println("Uppercase: " + hasUppercase(password));
        System.out.println("Lowercase: " + hasLowercase(password));
        System.out.println("Numbers: " + hasNumber(password));
        System.out.println("Special Characters: " + hasSpecialChar(password));

        String strength = calculateStrength(password);
        System.out.println("\nPassword Strength: " + strength);

        sc.close();
    }
}
