import java.sql.*;
/*
    DAO -> Data Access Object
 */

class Student {
    int rollno;
    String sname;

    public Student() {
        rollno = 0;
        sname = null;
    }

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }
}

class StudentDAO {
    private Connection con;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tt_chapter16",
                    "root",
                    "2003");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnect() {
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Student getStudent(int rollno) {
        Student s = new Student();
        s.rollno = rollno;

        // Fetch sname from database
        try {
            PreparedStatement pst = con.prepareStatement("select sname from student where rollno=?");
            pst.setInt(1,rollno);
            ResultSet rs = pst.executeQuery();
            rs.next();
            s.sname = rs.getString(1);
            pst.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return s;
    }

    public void addStudent(Student s) {
        // Add Student
        try {
            PreparedStatement pst = con.prepareStatement("insert into student values (?,?)");
            pst.setInt(1, s.rollno);
            pst.setString(2, s.sname);
            pst.executeUpdate();
            pst.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class DaoDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.connect();
//        Student s1 = dao.getStudent(3);
//        System.out.println(s1.sname);
        Student s2 = new Student(7, "Dam");
        dao.addStudent(s2);
        dao.disconnect();
    }
}
