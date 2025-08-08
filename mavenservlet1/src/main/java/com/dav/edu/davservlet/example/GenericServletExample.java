package com.dav.edu.davservlet.example;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GenericServletExample extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<html !DOCTYPE><head><title>GenericServlet Example</title></head><body>");
        out.println("<div><h1>This is a simple demonstration of GenericServlet</h1></div>");
        out.println("</body></html>");    
    }
}
