import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select role (student/teacher): ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("student")) {
            Student student = new Student();

            System.out.println("Student Name: ");
            String studentName = scanner.nextLine();
            student.setName(studentName);

            System.out.println("Student ID: ");
            int studentId = scanner.nextInt();
            student.setId(studentId);

            // Consume the newline character left by nextInt()
            scanner.nextLine();

            System.out.println("Email: ");
            String email = scanner.nextLine();
            student.setEmail(email);

            System.out.println("Phone: ");
            int phone = scanner.nextInt();
            student.setPhone(phone);

            // Consume the newline character left by nextInt()
            scanner.nextLine();

            System.out.println("Courses: ");
            String courses = scanner.nextLine();
            student.setCourses(courses);

            // Print the student information
            System.out.println("Student Information:");
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getId());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Phone: " + student.getPhone());
            System.out.println("Courses: " + student.getCourses());
        } else if (role.equalsIgnoreCase("teacher")) {
            Teacher teacher = new Teacher();

            System.out.println("Teacher Name: ");
            String teacherName = scanner.nextLine();
            teacher.setName(teacherName);

            System.out.println("Teacher ID: ");
            int teacherId = scanner.nextInt();
            teacher.setId(teacherId);

            // Consume the newline character left by nextInt()
            scanner.nextLine();

            System.out.println("Email: ");
            String email = scanner.nextLine();
            teacher.setEmail(email);

            System.out.println("Phone: ");
            int phone = scanner.nextInt();
            teacher.setPhone(phone);

            // Consume the newline character left by nextInt()
            scanner.nextLine();

            System.out.println("Subject: ");
            String subject = scanner.nextLine();
            teacher.setSubject(subject);

            // Print the teacher information
            System.out.println("Teacher Information:");
            System.out.println("Teacher Name: " + teacher.getName());
            System.out.println("Teacher ID: " + teacher.getId());
            System.out.println("Email: " + teacher.getEmail());
            System.out.println("Phone: " + teacher.getPhone());
            System.out.println("Subject: " + teacher.getSubject());
        } else {
            System.out.println("Invalid role. Please select 'student' or 'teacher'.");
        }
    }
}
