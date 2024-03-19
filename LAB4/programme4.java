class Student {
    private int student_roll;
    private String student_name;
    private int[] student_marks;

    
    public Student(int roll, String name, int[] marks) {
        this.student_roll = roll;
        this.student_name = name;
        this.student_marks = marks;
    }

   
    public void calculateAndDisplayAverage() {
        int totalMarks = 0;
        for (int mark : this.student_marks) {
            totalMarks += mark;
        }

        double averageMarks = (double) totalMarks / this.student_marks.length;

        System.out.println("Student Roll: " + this.student_roll);
        System.out.println("Student Name: " + this.student_name);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
       
        Student student1 = new Student(101, "John", new int[]{75, 80, 85, 90, 95});
        Student student2 = new Student(102, "Jane", new int[]{85, 88, 92, 78, 90});
        Student student3 = new Student(103, "Bob", new int[]{92, 75, 88, 90, 85});

        
        System.out.println("Average Marks for Student 1:");
        student1.calculateAndDisplayAverage();

        System.out.println("Average Marks for Student 2:");
        student2.calculateAndDisplayAverage();

        System.out.println("Average Marks for Student 3:");
        student3.calculateAndDisplayAverage();
    }
}
