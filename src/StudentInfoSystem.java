import java.util.Scanner;

// Abstract base class
abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void displayDetails();
}

// Student class
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Teacher class
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Add Student
        System.out.println("Add Student:");
        System.out.print("Name: ");
        String sName = sc.nextLine();
        System.out.print("Age: ");
        int sAge = sc.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        Student student = new Student(sName, sAge, rollNumber);

        // Add Teacher
        System.out.println("\nAdd Teacher:");
        System.out.print("Name: ");
        String tName = sc.nextLine();
        System.out.print("Age: ");
        int tAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(tName, tAge, subject);

        // Display both
        student.displayDetails();
        teacher.displayDetails();

        sc.close();
    }
}
