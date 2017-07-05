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

//String username =request.getParameter("txtStudentId");
//String password =request.getParameter("txtPassword");
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
 Connection con = DriverManager.getConnection(connectionUrl);

Statement stmt=con.createStatement();

ResultSet rset = stmt.executeQuery("select * from STUDENT");

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
    </head>
</html>
