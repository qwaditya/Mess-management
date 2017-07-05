/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import javax.servlet.http.*;

/**
 *
 * @author 1405362
 */
@WebServlet(name = "Search", urlPatterns = {"/Search"})
public class Search extends HttpServlet {
       public void doGet(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();        
              String name=request.getParameter("uname");      
              out.println("<html>");
          out.println("<body style='background-color: cyan;'>");
              try{
                     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                     String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
                     Connection con = DriverManager.getConnection(connectionUrl);               
                     PreparedStatement ps=con.prepareStatement("select * from ADMIN where name=?");
                     ps.setString(1,name);                   
                     out.print("<table width=25% border=1>");
                     out.print("<center><h1>Employee Details:</h1></center>");
                     ResultSet rs=ps.executeQuery();                
                     /* Printing column names */
                     ResultSetMetaData rsmd=rs.getMetaData();
                     while(rs.next())
                        {
                     out.print("<tr>");
                     out.print("<td>"+rsmd.getColumnName(1)+"</td>");
                        out.print("<td>"+rs.getString(1)+"</td></tr>");
                        out.print("<tr><td>"+rsmd.getColumnName(2)+"</td>");
                        out.print("<td>"+rs.getString(2)+"</td></tr>");
                        out.print("<tr><td>"+rsmd.getColumnName(3)+"</td>");
                        out.print("<td>"+rs.getString(3)+"</td></tr>");
                        out.print("<tr><td>"+rsmd.getColumnName(4)+"</td>");
                        out.print("<td>"+rs.getString(4)+"</td></tr>");     
                        out.print("<tr><td>"+rsmd.getColumnName(5)+"</td>");
                        out.print("<td>"+rs.getString(5)+"</td></tr>"); 
                     }
                     out.print("</table>");
                     out.print("</body>");
                     out.print("</html>");
 
              }catch (Exception e2)
                {
                    e2.printStackTrace();
                }
 
              finally{out.close();
                }
       }
 
} 