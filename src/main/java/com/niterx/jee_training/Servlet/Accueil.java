package com.niterx.jee_training.Servlet;

import com.niterx.jee_training.Beans.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Accueil", value = "/accueil")
public class Accueil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(1, "NiterX", "1234", true);

        String username = user.getUsername();
        request.setAttribute("username", username);
        if(user.isAdmin()==true){
            request.setAttribute("statut","admin");
        }
        else{
            request.setAttribute("statut","user");
        }
        this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
