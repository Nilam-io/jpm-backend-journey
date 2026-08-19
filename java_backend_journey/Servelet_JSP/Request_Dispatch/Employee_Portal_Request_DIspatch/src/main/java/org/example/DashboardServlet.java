package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String empId = request.getParameter("empId");
        String empName = request.getParameter("empName");

        response.setContentType("text/html");

        response.getWriter().println("<html>");
        response.getWriter().println("<body>");

        response.getWriter().println("<h1>Employee Dashboard</h1>");
        response.getWriter().println("<h2>Welcome " + empName + "</h2>");
        response.getWriter().println("<p>Employee ID: " + empId + "</p>");
        response.getWriter().println("<p>Login successful.</p>");

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
