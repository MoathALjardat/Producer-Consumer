import java.sql.*;

public class Producer {


    /*SELECT COUNT(*) FROM student;*/

    public static int getCount() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int numberOfRecords = 0;
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM student;");
            rs.next();
            numberOfRecords += rs.getInt(1);

            con.close();
            return numberOfRecords;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public static double getAverage(int i) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            int count = 1 ;
            double res = 0;
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student;");
            while (rs.next() && count < i) {
                count++ ;
            }
            res = rs.getDouble(3);
            con.close();

            try{
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return res;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

}
