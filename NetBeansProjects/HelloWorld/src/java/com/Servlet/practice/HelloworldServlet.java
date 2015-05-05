/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlet.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asi
 */
public class HelloworldServlet extends HttpServlet {
    

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //  super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        PrintWriter out = resp.getWriter();
       // out.println("<h1><3</h1>");
        String name=req.getParameter("name");
        String course=req.getParameter("course");
        String lang1=req.getParameter("java");
        String lang2=req.getParameter("c++");
        String lang3=req.getParameter("php");
        String destiny1=req.getParameter("ninoy");
        String destiny2=req.getParameter("mommy");
        String destiny="";
        String language=" ";
        if(lang1!=null){language+=lang1+" ";}
        if(lang2!=null){language+=lang2+" ";}
        if(lang3!=null){language+=lang3+" ";}
        
        if(destiny1.equals("ninoy aquino")){destiny+=" ninoy akino";}
         else{destiny+=" mommy d";}
        out.println("<h1>Hello " + name+" !</h1>");
        out.println("<h2>You are a "+ course+ " student. </h2");
        out.println("<h2>You must learn"+language +" .</h2");
        out.println("<h2>Your destiny is "+destiny +" .</h2");
        
    }
   

}
