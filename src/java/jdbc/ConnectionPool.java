/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author 1405362
 */
public class ConnectionPool {
    public ConnectionPool() {
super();
}
private static Connection con=null;
public static Connection getConnection()
{
try
{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
System.out.println("------driver loaded------------------");
//con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/performancedb", "root", "root");
String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
con = DriverManager.getConnection(connectionUrl);

System.out.println(con+"------------------------");
if (con != null) {
System.out.println("Connection Pool Database Connection Success");
}
}catch(ClassNotFoundException cfe)
{
System.out.println(cfe+"---------------");
}catch(SQLException se)
{
	System.out.println(se+"---------------");
}

return con;
}
/*public static void main(String[] args) 
{
	System.out.println("Hello World!");
	Connection con1 = ConnectionPool.getConnection();
	System.out.println("Hello World!"+con1);
}*/

}
