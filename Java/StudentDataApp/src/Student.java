import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.studentYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + studentYear + " " + studentID);

    }

    // generate an ID
    private void setStudentID() {
        // grade level + ID
        id++;
        this.studentID = studentYear + "" + id;
    }

    // enroll in classes/classes
    public void enroll() {
        // get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll in (q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }
        while (true);

        System.out.println("ENROLLED IN: " + courses);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // print student status
}
