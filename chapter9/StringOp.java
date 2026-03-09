import java.util.Scanner;

/**
 * Write a program to accept two strings from user and perform following operations.
 * 1. find out length of both the strings.
 * 2. concatenation of two strings.
 * 3. convert first string into UPPERCASE.
 */
class StringOp {
    public static void SOP(String a, String b) {
        System.out.println("Length of string a is " + a.length());
        System.out.println("Length of string b is " + b.length());

        System.out.println("Concatenation of a and b is " + a.concat(b));
        System.out.println("String a to uppercase is " + a.toUpperCase());
    }

    public static void main(String[] args) {
//        String s1, s2;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2 strings");
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//
//        SOP(s1,s2);

//        Student s1 = new Student("Shasank", 7);
//        System.out.println(s1);     // Will print s1.toString

        Split csv = new Split();
        csv.splitter("Chicken,Duck,Cow,Bird");
    }
}

// demo for toString
class Student {
    int rollno;
    String sname;

    public Student(String sname, int rollno) {
        this.sname = sname;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }
}

// Demo for String Split
class Split {
    public void splitter(String str) {
        String[] names = str.split(",");

        for(String s : names)
            System.out.println(s);
    }
}