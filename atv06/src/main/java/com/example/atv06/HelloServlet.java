package com.example.atv06;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mensagem = "Requisição feita!";


        response.setContentType("text/html");
        response.getWriter().println("<html><body><p>" + mensagem + "</p></body></html>");
    }

    public void destroy() {
    }
}