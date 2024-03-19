class Student {
    private int student_roll;
    private String student_name;
    private int[] student_marks;

    
    public Student(int roll, String name, int[] marks) {
        this.student_roll = roll;
        this.student_name = (name != null && !name.isEmpty()) ? name : "Unknown";
        this.student_marks = (marks != null && marks.length == 5) ? marks : new int[5];
    }

    
    public Student() {
        this(0, null, null); // Default values for roll, name, and marks
    }

    
    public void displayStudentDetails() {
        System.out.println("Student Roll: " + this.student_roll);
        System.out.println("Student Name: " + this.student_name);
        System.out.println("Student Marks: ");
        for (int i = 0; i < this.student_marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + this.student_marks[i]);
        }
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        
        Student student1 = new Student(101, "John", new int[]{75, 80, 85, 90, 95});
        Student student2 = new Student();

       
        System.out.println("Details of Student 1:");
        student1.displayStudentDetails();

       
        System.out.println("Details of Student 2:");
        student2.displayStudentDetails();
    }
}
