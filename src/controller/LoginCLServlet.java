package controller;

import pojo.User;

import java.io.IOException;

/**
 * Created by Administrator on 2017/10/30.
 */
public class LoginCLServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String account = request.getParameter("account");
        String password = request.getParameter("password");



		User user = new User(account,password);
        try {
			if(user.isExist()){
            response.sendRedirect("/welcome");
			}else{
            response.sendRedirect("/error");
			}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
