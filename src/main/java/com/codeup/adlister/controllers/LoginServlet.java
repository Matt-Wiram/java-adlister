package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers/LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sadf");

//        if (request.getSession().getAttribute("user") != null) {
//            response.sendRedirect("/profile");
//            return;
//        }
//
//        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("adsf");
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        User user = DaoFactory.getUsersDao().findByUsername(username);
//
//        if (user == null) {
//            response.sendRedirect("/login");
//            return;
//        }
//
////        boolean validAttempt = password.equals(user.getPassword());
//
//        boolean check = BCrypt.checkpw(password, user.getPassword());
//        System.out.println(check);
//        if (check) {
//            request.getSession().setAttribute("user", user);
////            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
//            response.sendRedirect("/profile");
//        } else {
//            System.out.println("asdf");
//            response.sendRedirect("/login");
//        }
    }
}
