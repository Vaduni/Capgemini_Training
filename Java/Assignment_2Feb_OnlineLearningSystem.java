package capgemeini_training;

import java.util.Scanner;

public class Assignment_2Feb_OnlineLearningSystem {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        Student student = new Student("vaduni", 1111, 2005,"vaduni@gmail.com");
        Trainer trainer = new Trainer("niranjan@gmail.com", 2222,"Niranjan","CSE");

        System.out.println("1 Student Login");
        System.out.println("2 Trainer Login");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter name: ");
            String u = sc.nextLine();
            System.out.print("Enter id: ");
            int p = Integer.parseInt(sc.nextLine());

            if (student.login(u, p)) {
                System.out.println("Student Loginned");

                System.out.println("1 Course Creation");
                System.out.println("2 Program Tracking");
                System.out.println("3 Generate Certificate");
                int opt = sc.nextInt();
                sc.nextLine();

                switch (opt) {
                    case 1:
                        System.out.print("Enter course ");
                        student.enrollCourse(sc.nextLine());
                        break;

                    case 2:
                        System.out.print("Enter progress %: ");
                        student.updateProgress(sc.nextInt());
                        break;

                    case 3:
                        student.generateCertificate();
                        break;
                }
            } else {
                System.out.println("Invalid Student");
            }
        }

        else if (choice == 2) {
            System.out.print("Enter name: ");
            String u = sc.nextLine();
            System.out.print("Enter id: ");
            int p = Integer.parseInt(sc.nextLine());

            if (trainer.login(u, p)) {
                System.out.println("Trainer Loginned");
                System.out.print("Enter course to create: ");
                trainer.createCourse(sc.nextLine());
            } else {
                System.out.println("Invalid Trainer");
            }
        }

        sc.close();  
    }
    static class User {
     String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean login(String u, int p) {
        return name.equals(u) && id == p;
    }
}
static class Student extends User {
    private String enrolledCourse;
    private int progress; 

    public Student(String Student_name, int id, int dob,String email) {
        super(Student_name, id);
        progress = 0;
    }

    public void enrollCourse(String courseName) {
        enrolledCourse = courseName;
        System.out.println("Enrolled in course: " + courseName);
    }

    public void updateProgress(int progress) {
        this.progress = progress;
        System.out.println("Progress updated to " + progress + "%");
    }

    public void generateCertificate() {
        if (progress == 100) {
            System.out.println(" Certificate Generated for course: " + enrolledCourse);
        } else {
            System.out.println("Complete 100% course to get certificate.");
        }
    }
}
static class Trainer extends User {

    public Trainer(String email, int id,String TrainerName, String Department) {
        super(TrainerName, id);
    }

    public void createCourse(String courseName) {
        System.out.println("Course created: " + courseName);
    }
}
static class Course {
    String courseName;
    int course_Id;
    int credit;

    public Course(String courseName, int course_Id,int credit) {
        this.courseName = courseName;
        this.course_Id = course_Id;
        this.credit = credit;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName + ", course_Id: " + course_Id+", credit: " + credit);
    }
}

}
