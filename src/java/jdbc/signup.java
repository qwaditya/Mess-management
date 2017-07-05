package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.datalayer;

@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          PrintWriter out = response.getWriter();
           // try{
            
     String u=request.getParameter("Invoiceno");
     String p=request.getParameter("InvoiceDate");
     String a=request.getParameter("ItemName");
     String q=request.getParameter("UnitPrice");
     String c=request.getParameter("VATPercentage");
     String d=request.getParameter("QTY");
     String e=request.getParameter("QTYtype");
     String f=request.getParameter("TotalAmount");
     //String g=request.getParameter("vno");
     //String ha=request.getParameter("h");
     /* String y = "select * from stockhistory";
    ResultSet rs=datalayer.selectdata(y);
          if(  rs.next())
       { 
           String un = rs.getString(3);
           if(un.equals(u))
           {
            RequestDispatcher rd=request.getRequestDispatcher("features2.jsp");
   rd.include(request,response);
   out.print("<font color='red' size='3'>");
           out.print("USERNAME ALREADY EXIST.");
           }
 if(u.equals("")||p.equals("")||a.equals("")||c.equals("")||d.equals("")||q.equals("")||e.equals("")||f.equals(""))
           {
            RequestDispatcher rd=request.getRequestDispatcher("features2.jsp");
   rd.include(request,response);
   out.print("<font color='red' size='3'>");
           out.print("ENTER ALL DETAILS");
           }
       else
           {
                 if(!p.equals(q))
           {
               RequestDispatcher rd=request.getRequestDispatcher("features2.jsp");
   rd.include(request,response);
   out.print("<font color='red' size='3'>");
               
               out.print("CONFIRM PASSWORD DOESN'T MATCH.");
       }*/
          //String y="select * from login where lid = " +u ;
               // else
                 //{
                 //String r="user";
String v="insert into purchase(Invoiceno,InvoiceDate,ItemName,UnitPrice,VATPercentage,QTY,QTYType,TotalAmount) values('"+u+"','"+p+"','"+a+"','"+q+"','"+c+"','"+d+"','"+e+"','"+f+"')";
         
                
                datalayer.updateData(v);
      
                
           RequestDispatcher rd=request.getRequestDispatcher("features2.jsp");
   rd.include(request,response);
    out.print("<font color='white' size='5'>DETAILS ADDED SUCCESSFULLY,CLICK STOCKHISTORY TO CHECK.</font>");
           //}
       //}
         //   }
           // }
          //  catch(SQLException | IOException e)
            //{
              //  System.out.println("exception caught");
           // }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
