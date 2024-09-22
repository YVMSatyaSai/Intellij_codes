

import java.sql.*;


public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
         * import the package // import org.postgresql.Driver;
         * load and register  // Class.forName("org.postgresql.Driver");
         * create connection
         * create statement
         * execute statement
         * process the result
         * close the connection
         */

/*      String url = "jdbc:postgresql://localhost:5432/testing";
        String userName = "tester";
        String password = "test@1234";
        Connection con = DriverManager.getConnection(url,userName,password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        String query = "select * from Students where Id = 2;";
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("name");
        int id = rs.getInt("id");
        System.out.println("Name : " + name + " \nId : " + id);

        con.close();
        System.out.println("Connection Closed...");
*/
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testing","tester","test@1234");
        Statement st = con.createStatement();

/*
        PreparedStatement st1 = con.prepareStatement("INSERT INTO students VALUES (?,?,?,?,?);");
        st1.setInt(1,5);
        st1.setString(2,"Hari");
        st1.setInt(3,72);
        st1.setTimestamp(4, Timestamp.valueOf("2024-09-22 16:00:00"));
        st1.setString(5,"Hindi");
        st1.execute();
*/

/*
        ResultSet rs = st.executeQuery("select * from Students;");
        while (rs.next()) {
            System.out.println("Id : " + rs.getInt("id") + " , Name : " + rs.getString("name"));
        }
*/

/*
        st.execute("INSERT INTO students VALUES (5,'Raju',39,'2024-09-22 15:13:00','Telugu');");
        st.execute("UPDATE students SET name='Mohan', marks=63, time='2024-09-22 15:40:00', subject='Science' WHERE id=4;");
        st.execute("DELETE FROM students WHERE id = 5");
*/

        con.close();



    }
}
