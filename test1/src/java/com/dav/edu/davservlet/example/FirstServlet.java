package com.dav.edu.davservlet.example;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet {
    ServletConfig sc;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        System.out.println("Servlet is running ....");
        this.sc = sc;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.sc;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        //setting content type
        res.setContentType("text/html");
        //to display html tag ot element or any content
        out.println("<html !DOCTYPE><head><title>Servlet Demo</title></head><body>");
        out.println("<div><h1>This is our first Servlet Program</h1></div>");
        out.println("</body></html>");
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
