<%@page import="java.sql.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <%

out.println("test page");

try {

String username =request.getParameter("email");
String password =request.getParameter("pass");
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
 Connection con = DriverManager.getConnection(connectionUrl);

Statement stmt=con.createStatement();

ResultSet rset = stmt.executeQuery("select StudentId,Password from STUDENT where StudentId = '"+username+"' and Password = '"+password+"'");

if (rset.next()== true) {
     response.sendRedirect("home22.jsp");
out.println("Login Successfull");
out.println("welcome admin");
out.println ("TS ID: " + rset.getString(1)); // Print col 1

}
else
    {
      
        response.sendRedirect("Login.jsp");
          //out.println("Login not Successfull");
        //out.println("you r nt the admin");
    }

stmt.close();

}

catch(SQLException e) {

out.println("SQLException: " + e.getMessage() + "<BR>");

while((e = e.getNextException()) != null)

out.println(e.getMessage() + "<BR>");

    }

catch(ClassNotFoundException e) {

out.println("ClassNotFoundException: " + e.getMessage() + "<BR>");

}

%>