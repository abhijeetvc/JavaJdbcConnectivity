import java.sql.*;
import java.util.Scanner;

public class JdbcConnect {

    public static void main(String[] args)  {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/eveningjdbcdemo",
                            "root","jesus");

          //  Statement stmt=con.createStatement();

            //        ResultSet rs=stmt.executeQuery("select * from employee");

//            while(rs.next()){
//                System.out.println("Id is: "+rs.getInt(1));
//                System.out.println("Name is: "+rs.getString(2));
//                System.out.println("City is: "+rs.getString(3));
//                System.out.println("\n");
//            }

              //Inserting data to database
    //        stmt.execute("insert into employee values(3,'Emp3','Hyderabad')");

            //Updating record
     //       stmt.execute("update employee set city='Bangalore' where id=3");

            //Deleting record
         //   stmt.execute("delete from employee where id=3");
//---------------------------------------------------------------------------------------------

            PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
            Scanner sc=new Scanner(System.in);
            System.out.println("Provide Employee Details : ");

            System.out.println("Enter Id: ");
            int id=sc.nextInt();
            pst.setInt(1,id);

            System.out.println("Enter Name: ");
            String name=sc.next();
            pst.setString(2,name);

            System.out.println("Enter city: ");
            String city=sc.next();
            pst.setString(3,city);

            pst.execute();
            System.out.println("Data Inserted");

            
           // System.out.println("connected to Database");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Driver not found");
        }

      //  System.out.println("Please add the driver");


    }
}
