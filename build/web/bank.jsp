
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

        String nnamees = request.getParameter("NewName");
        String enaddreess = request.getParameter("EmailAddress");
        String nnatione = request.getParameter("Nationality");
        String unseride = request.getParameter("UserName");
        String pnwe = request.getParameter("Password");
        String nnationly = request.getParameter("QTY");
               
        
        
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

         

st = con.prepareStatement("INSERT INTO bank(bankname,address,accountno,bankcode,branch,chequeno) VALUES (?,?,?,?,?,?)");

                 st.setString(1,nnamees);
                 st.setString(2,enaddreess);
                 st.setString(3,nnatione);
                 st.setString(4,unseride);
                 st.setString(5,pnwe);
                 st.setString(6,nnationly);
                 

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
            response.sendRedirect("works.jsp");

            con.close();
        } catch (Exception e) { }

        //response.sendRedirect("home.jsp");
%>



</body>
</html>