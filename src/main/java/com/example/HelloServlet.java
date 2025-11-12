package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head><title>Hello Servlet</title></head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>Hello from Tomcat!</h1>");
        resp.getWriter().println("<p>This is a simple Java web app running on Tomcat.</p>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }
}

