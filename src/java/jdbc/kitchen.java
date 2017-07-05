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
@WebServlet(name = "kitchen", urlPatterns = {"/kitchen"})
public class kitchen extends HttpServlet {
       public void doGet(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
              response.setContentType("text/html");
               PrintWriter out = response.getWriter();        
              String name=request.getParameter("unamee");     
              out.println("<html>");
               out.println("<body bgcolor = 'blue',text='red'>");
              try{
                     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                     String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
                     Connection con = DriverManager.getConnection(connectionUrl);               
                     PreparedStatement pss=con.prepareStatement("select * from kitchen where item=?");
                     pss.setString(1,name); 
             out.println("<table border=1 width=15% height=15%>");
             out.print("<center><h1>Kitchen Item Details:</h1></center>");
             out.println("<tr><th>ItemId</th><th>CategoryID</th><th>ITEM</th><th>QTY</th><th>Type</th><th>UnitPrice</th><th>TotalPrice</th><th>Created Date</th><th>Barcode</th></tr>");
             ResultSet rss=pss.executeQuery();                
                     /* Printing column names */
                     ResultSetMetaData rsmd=rss.getMetaData();
             while (rss.next()) {
                 String n = rss.getString("itemid");
                 String nm = rss.getString("categoryid");
                 String s = rss.getString("item"); 
                 String se = rss.getString("qty");
                  String no = rss.getString("type");
                 String nme = rss.getString("unitprice");
                 String sa = rss.getString("totalprice"); 
                 String see = rss.getString("createddate");
                 String seed = rss.getString("barcode");
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + se + "</td><td>" + no + "</td><td>" + nme + "</td><td>" + sa + "</td><td>" + see + "</td><td>" + seed + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("</body>");
              out.println("</html>");
             con.close();
            }
             catch (Exception e) {
             out.println("error");
         }
              finally{out.close();
                }
     }
 }
