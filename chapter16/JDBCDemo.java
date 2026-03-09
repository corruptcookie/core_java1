import java.sql.*;
/*
    Java Database Connectivity
    1. import package --> java.sql
    2. load and register driver --> com.mysql.jdbc.Driver
    3. create connection
    4. create a statement
    5. execute query
    6. process results
    7. close --> st.close, con.close
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/tt_chapter16";
        String uname = "root";
        String pass = "2003";
//        String query = "select sname from student where rollno=3"; // Selects Jim
//        String query2 = "select * from student";
//        String query3 = "insert into student values (4,'John')";
        String query4 = "insert into student values (?,?)"; // Using ? for PreparedStatement

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

//        Statement st = con.createStatement();
        PreparedStatement pst = con.prepareStatement(query4);

//        ResultSet rs = st.executeQuery(query2);
//        st.executeUpdate(query3);   // Returns number of rows affected
        pst.setInt(1, 5);
        pst.setString(2, "Pam");
        pst.executeUpdate();

        // Take pointer down from column names
//        while (rs.next()) {
//            String userData = rs.getInt(1) + " : " + rs.getString(2);
//            System.out.println(userData);
//        }

//        st.close();
        pst.close();
        con.close();

    }
}