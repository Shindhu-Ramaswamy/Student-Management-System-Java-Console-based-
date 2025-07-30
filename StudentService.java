package studentManagementSystem;

import java.util.*;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        studentList.removeIf(s -> s.getId() == id);
        System.out.println("Student removed if existed.");
    }

    public void searchStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void updateStudent(int id, String name, String dept) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                s.setName(name);
                s.setDepartment(dept);
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

