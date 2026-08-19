package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String empId = request.getParameter("empId");
        String empName = request.getParameter("empName");

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);

        request.getRequestDispatcher("/dashboard")
                .forward(request, response);
    }
}
