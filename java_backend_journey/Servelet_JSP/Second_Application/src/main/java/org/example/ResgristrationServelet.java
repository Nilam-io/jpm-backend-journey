package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/registration")
public class ResgristrationServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        response.setContentType("text/html");

        response.getWriter().println("<html>");
        response.getWriter().println("<body>");

        response.getWriter().println("<h2>Registration Successful!</h2>");
        response.getWriter().println("<p>Welcome " + name + "!</p>");
        response.getWriter().println("<p>Your city is " + city + ".</p>");

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
