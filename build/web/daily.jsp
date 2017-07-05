
<html>
<head>
<title>Validate New User</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body bgcolor="#FFFFFF" text="#000000">
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>

<%
        Connection con = null;

        String nnameess = request.getParameter("NewName");
        String enaddreesss = request.getParameter("EmailAddress");
        String nnationes = request.getParameter("Nationality");
                      
        
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance ();
              String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
              con = DriverManager.getConnection(connectionUrl);
              
                 PreparedStatement st=null;
                 
                 
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //String queryText="insert into user_details(fullName,emailAddress,nationality,username,password) values('"+names+"','"+eaddress+"','"+nation+"','"+userid+"','"+pw+"')";
        //String queryText = "insert into user_details (\"fullName\", \"emailAddress\", 

//\"nationality\", \"username\", \"password\") 

//values('"+names+"','"+eaddress+"','"+nation+"','"+ userid+"','"+pw+"')";
        try {
              
              // String queryText="insert into user_details(fullName,emailAddress,nationality,username,password) values('"+names+"','"+eaddress+"','"+nation+"','"+userid+"','"+pw+"')";

         

st = con.prepareStatement("INSERT INTO expense2(expense_date,expense_type,amount) VALUES (?,?,?)");

                 st.setString(1,nnameess);
                 st.setString(2,enaddreesss);
                 st.setString(3,nnationes);
                 

                  st.executeUpdate();
                 int i=st.executeUpdate();
                // st.clearParameters();
                 if(i!=0)
{ 
System.out.println("Record has been inserted"); 
} 
else
{ 
System.out.println("failed to insert the data"); 
}
            out.println("Data is successfully inserted!"); 
            response.sendRedirect("about.jsp");

            con.close();
        } catch (Exception e) { }

        //response.sendRedirect("home.jsp");
%>



</body>
</html>