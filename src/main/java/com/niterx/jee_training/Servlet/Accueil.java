package com.niterx.jee_training.Servlet;

import com.niterx.jee_training.Beans.Authentication;
import com.niterx.jee_training.Beans.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Accueil", value = "/accueil")
public class Accueil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Authentication authentication = new Authentication();
        authentication.verif(request);
        request.setAttribute("authentication", authentication);
        this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request,response);
    }
}
