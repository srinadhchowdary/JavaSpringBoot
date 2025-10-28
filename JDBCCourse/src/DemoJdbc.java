import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {


        /*
            import package
            load and register drivers
            create connection
            create statement
            execute statement
            process the results
            close connection
         */


        int sid = 103;
        String sname = "raj";
        int marks = 44;


        //need to mention demo's ipz address
        String url =  "jdbc:postgresql://localhost:5432/demo";
        String uname=  "postgres";
        String pass=  "${Password}";


        //for statement
//        String sql = "update student set sname = 'Max' Where sid = 5";
//        String sql = "delete from student where sid=103";
//        String sql = "insert into student values(" + sid +",'" + sname + "', " + marks + ")";

        //for prepared statement
        String sql = "insert into student values (?,?,?)";
//        String sql = "delete from student where sid=?";
//        String sql = "update student set sname = ? Where sid = ?";



        //load driver
        Class.forName("org.postgresql.Driver");
        //create connection
        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection Established");
//     Statement st = con.createStatement();

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);

        //st.execute(sql);

        boolean status  =st.execute();
        System.out.println(status);

        /*

            ResultSet rs =st.executeQuery(sql);
            rs.next();
            String name = rs.getString("sname");
            System.out.println("Name of the student is "+name);

            while(rs.next()){
            System.out.print(rs.getInt(1)+" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.println(rs.getInt(3));
        }

         */

        con.close();
        System.out.println("Connection Exhausing");

    }
}
