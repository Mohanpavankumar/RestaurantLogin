import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohan
 */
public class paymentservlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>paymentservlet</title>"); 
            out.print(" <style>\n" +
"        h1{\n" +
"            text-align: center;\n" +
"            color: red;\n" +
"            font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;\n" +"\n" +
"        }\n" +
"        body{\n" +
"            background-color: yellow;\n" +
"        }\n" +
"        .a1 input{\n" +
"            background-color: blue;\n" +
"            color: white;\n" +
"            border: 2px solid black;\n" +
"            padding: 2px;\n" +
"            border-radius: 3px;\n" +
"        }\n" +
"    </style>");
            out.println("</head>");
            out.println("<body>\n" +
"    <h1>Payment Details</h1>\n" +
"    <table  align=\"center\">\n" +
"        <tr>\n" +
"            <td>\n" +
"                Amount <td><input type=\"text\" name=\"amount\"></td>\n" +
"            </td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>\n" +
"               Cardholder Name  <td><input type=\"text\" name=\"holdername\"></td>\n" +
"            </td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>\n" +
"                Card Number  <td><input type=\"text\" name=\"cardnumber\" maxlength=\"16\"></td>\n" +
"            </td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>\n" +
"                Expiry  <td><input type=\"text\" name=\"expiry\"></td>\n" +
"            </td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>\n" +
"               Security Code  <td><input type=\"text\" name=\"security\"></td>\n" +
"            </td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>\n" +
"                <td class=\"a1\"><a href=\"successservlet\"><input type=\"submit\"></td></td>\n" +
"            </td>\n" + "\n" +
"        </tr>\n" +
"    </table>\n" +
"</body>");
            out.println("</html>");
        }
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
    }
}
