import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ask how many users we want to add
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();

        Student[] students = new Student[numStudents];

        // create a number of new students/users
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
}
