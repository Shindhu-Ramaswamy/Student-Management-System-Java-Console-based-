package studentManagementSystem;

public class Student {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
