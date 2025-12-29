package week7workshop;

public class GradeCalculator {

    public static char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        int marks = 85;
        System.out.println("Grade: " + calculateGrade(marks));
    }
}
