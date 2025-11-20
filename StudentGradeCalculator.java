import java.util.Scanner;

public class StudentGradeCalculator {

    // Function to calculate total
    public static double calculateTotal(double[] marks) {
        double total = 0;
        for (double m : marks) {
            total += m;
        }
        return total;
    }

    // Function to calculate percentage
    public static double calculatePercentage(double total) {
        return (total / 500) * 100;
    }

    // Function to calculate GPA (Simple 10 scale)
    public static double calculateGPA(double percentage) {
        return percentage / 9.5;   // Common conversion
    }

    // Function to get grade
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F (Fail)";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] marks = new double[5];

        System.out.println("===== Student Grade Calculator =====");

        // Input marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }

        // Calculations
        double total = calculateTotal(marks);
        double percentage = calculatePercentage(total);
        double gpa = calculateGPA(percentage);
        String grade = getGrade(percentage);

        // Output result
        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
