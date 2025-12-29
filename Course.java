package week7workshop;

public class Course {
    private String courseName;
    private int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Credits: " + credits);
    }

    public static void main(String[] args) {
        Course c = new Course("Mathematics", 4);
        c.displayCourseInfo();
    }
}
