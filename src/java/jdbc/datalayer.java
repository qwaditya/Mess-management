package jdbc;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "datalayer", urlPatterns = {"/datalayer"})
public class datalayer {

private static Connection con;
    static
    {
        try
        {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                   String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
                    con = DriverManager.getConnection(connectionUrl);
        }
     catch(ClassNotFoundException | SQLException e)
    {
        System.out.println("CONNECTION ERROR:"+e.getMessage());
    }
    }
    public static Connection getcon()
    {
        return con;
    }

public static int updateData(String dmlquery)
{
try
{
Statement st=con.createStatement();
int ur=st.executeUpdate(dmlquery);
return ur;
}
catch(Exception e)
{
    System.out.println("UPDATE ERROR"+e.getMessage());
return -1;
}

}





public static ResultSet selectdata(String projectionquery)
{
try{
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(projectionquery);
return rs;
}
catch(Exception e)
{
    System.out.println("SELECT ERROR"+e.getMessage());
return null;
}
}
}