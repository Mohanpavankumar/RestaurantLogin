/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class kfcrestaurant extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kfcrestaurant</title>"); 
            out.print("<style>\n" +
"        .a1{\n" +
"            background-color:red;\n" +
"            font-family: Verdana, Geneva, Tahoma, sans-serif;\n" +
"            font-size: 30px;\n" +
"            font-weight: bold;\n" +
"            color: yellow;\n" +
"\n" +
"        }\n" +
"        .a2{\n" +
"            border-radius: 3px;\n" +
"\n" +
"        }\n" +
"        .a3{\n" +
"            \n" +
"            color: rgb(0, 255, 255);\n" +
"            text-align: center;\n" +
"            font-size: 17px;\n" +
"            font-weight: bold;\n" +
"        }\n" +
"        .a4{\n" +
"            background-color:black;\n" +
"        }\n" +
"        .a5{\n" +
"            border: 3px solid greenyellow;\n" +
"            border-radius: 3px;\n" +
"\n" +
"        }\n" +
"        .a7{\n" +
"            float:left;\n" +
"            margin:45px;\n" +
"        }\n" +
"        input{\n" +
"            background-color: blue;\n" +
"            color: white;\n" +
"            border-radius: 3px;\n" +
"            border: 2px solid black;\n" +
"        }\n" +
"        .a0{\n" +
"            color: gold;\n" +
"            text-align: center;\n" +
"            font-weight: bold;\n" +
"        }\n" +
"    </style>");
            out.println("</head>");
            out.println("<body class=\"a4\">\n" +
"    <div>\n" +
"        <h1 class=\"a1\" align=\"center\" >Kentucky Fried Chicken</h1>\n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a4.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>French Fries</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $60\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div> \n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a5.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>Grilled</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $70\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a6.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>Fried Chicken</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $70\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a7.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>Meal Box</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $80\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a8.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>Wings</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $70\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a2.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>Lays</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $50\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a3.jpg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>Kentuchy</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $80\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
"    <div class=\"a7\">\n" +
"        <table class=\"a5\">\n" +
"            <tr>\n" +
"                <td >\n" +
"                    <img class=\"a2\" src=\"Images\\a9.jpeg\" alt=\"kfc\" height=\"200\" width=\"200\">\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\" style=\"color:red\">\n" +
"                    <big><big>French Fries</big></big>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">Superior material with safe</td>\n" +
"            <tr>\n" +
"                <td class=\"a3\" >producing process offers</td>\n" +
"            \n" +
"            <tr>\n" +
"                <td class=\"a3\">super soft and healthy touch</td>\n" +
"            </tr>\n" +
"            <tr> \n" +
"                <td class=\"a3\">feel, good color fastness </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a3\">and lint-free feature</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"a0\">\n" +
"                    Cost : $60\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td align=\"center\" style=\"padding:8px;cursor:pointer;\">\n" +
"                     <a href=\"paymentservlet\"><input type=\"button\" value=\"Buy Now\"></a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            </tr>\n" +
"        </table>      \n" +
"    </div>\n" +
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
     **/
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
