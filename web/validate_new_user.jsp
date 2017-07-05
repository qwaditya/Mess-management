
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

        String namees = request.getParameter("NewName");
        String eaddreess = request.getParameter("EmailAddress");
        String natione = request.getParameter("Nationality");
        String useride = request.getParameter("UserName");
        String pwe = request.getParameter("Password");
        String nationly = request.getParameter("QTY");
        String useridd = request.getParameter("Qtytype");
        String pwp = request.getParameter("Amount");
        
        
        
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

         

st = con.prepareStatement("INSERT INTO stockhistory(Invoiceno,InvoiceDate,ItemName,UnitPrice,VATPercentage,QTY,QTYtype,TotalAmount) VALUES (?,?,?,?,?,?,?,?)");

                 st.setString(1,namees);
                 st.setString(2,eaddreess);
                 st.setString(3,natione);
                 st.setString(4,useride);
                 st.setString(5,pwe);
                 st.setString(6,nationly);
                 st.setString(7,useridd);
                 st.setString(8,pwp);

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
            response.sendRedirect("home.jsp");

            con.close();
        } catch (Exception e) { }

        //response.sendRedirect("home.jsp");
%>



</body>
</html>