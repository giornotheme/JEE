package com.niterx.jee_training.Beans;

import javax.servlet.http.HttpServletRequest;

public class Authentication {
    private String result;
    User user = new User(1, "NiterX", "1234");

    public void verif(HttpServletRequest httpServletRequest){
        String nom = httpServletRequest.getParameter("nom");
        String pass = httpServletRequest.getParameter("pass");

        if(nom.equals(user.getUsername()) && pass.equals(user.getPassword())){
            result = "Vous êtes bien connecté" + user.getUsername();
        }
        else{
            result = "Mauvais credentials";
        }
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
