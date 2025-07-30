package studentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    service.addStudent(new Student(id, name, dept));
                    break;
                case 2:
                    service.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter new Department: ");
                    dept = sc.nextLine();
                    service.updateStudent(id, name, dept);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextInt();
                    service.deleteStudent(id);
                    break;
                case 5:
                    System.out.print("Enter ID to search: ");
                    id = sc.nextInt();
                    service.searchStudent(id);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 6);

        sc.close();
    }
}
