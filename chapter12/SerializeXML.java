import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
    Serialization in XML file
        Very efficient data storage
 */

public class SerializeXML {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setRollno(101);
        st1.setSname("S1");

        Student st2 = new Student();
        st2.setRollno(102);
        st2.setSname("S2");

        List<Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);

        College c = new College();
        c.setStudents(s);

        try {
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}