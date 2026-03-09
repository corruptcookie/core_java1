import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// How to use Comparable interface to create custom sort
// If using custom class, use comparable interface
// If using inbuilt class, use comparator

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, 55));
        studs.add(new Student(2, 95));
        studs.add(new Student(3, 35));
        studs.add(new Student(4, 45));
        studs.add(new Student(5, 85));

        // Using Comparator interface
//        studs.sort((s1,s2) -> Integer.compare(s1.marks, s2.marks));
        Collections.sort(studs);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.marks, o.marks);
    }
}