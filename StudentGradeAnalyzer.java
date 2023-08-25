import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            studentGrades[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
        }

        double sum = 0.0;
        for (double grade : studentGrades) {
            sum += grade;
        }
        double average = sum / numStudents;

        System.out.println("Student Grade Analysis:");
        System.out.println("Average Grade: " + average);

        System.out.println("Students who scored below average:");
        for (int i = 0; i < numStudents; i++) {
            if (studentGrades[i] < average) {
                System.out.println(studentNames[i] + ": " + studentGrades[i]);
            }
        }

        scanner.close();
    }
}
