package com.campuspath.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("""
            <html>
            <head>
                <title>CampusPath</title>
            </head>
            <body>
                <h1>CampusPath is running!</h1>
                <p>Kahin bhi, seedha pahuncho.</p>
            </body>
            </html>
        """);
    }
}
