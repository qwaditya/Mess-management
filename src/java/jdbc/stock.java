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
@WebServlet(name = "stock", urlPatterns = {"/stock"})
public class stock extends HttpServlet{
    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
         PrintWriter out = res.getWriter();
         res.setContentType("text/html");
         out.println("<html>");
         out.println("<body bgcolor = 'yellow',text='red'>");
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String connectionUrl="jdbc:sqlserver://localhost:1433;user=sa;password=p@ssw0rd;"+"databaseName=newdatabase;";
             Connection con = DriverManager.getConnection(connectionUrl); 
             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from stockhistory");
             out.println("<table border=1 width=35% height=35%>");
             out.print("<center><h1>StockHistory Details:</h1></center>");
             out.println("<tr><th>INVOICENO</th><th>INVOICEDATE</th><th>ITEMNAME</th><th>UNITPRICE</th><th>VATPERCENTAGE</th><th>QTY</th><th>QTYTYPE</th><th>TOTALAMOUNT</th></tr>");
             while (rs.next()) {
                 String n = rs.getString("Invoiceno");
                 String nm = rs.getString("InvoiceDate");
                 String s = rs.getString("ItemName"); 
                 String se = rs.getString("UnitPrice");
                  String no = rs.getString("VATPercentage");
                 String nme = rs.getString("QTY");
                 String sa = rs.getString("QTYtype"); 
                 String see = rs.getString("TotalAmount");
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + se + "</td><td>" + no + "</td><td>" + nme + "</td><td>" + sa + "</td><td>" + see + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("</body");
             out.println("</html>");
             con.close();
            }
             catch (Exception e) {
             out.println("error");
         }
     }
 }
