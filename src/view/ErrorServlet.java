package view;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/10/30.
 */
@javax.servlet.annotation.WebServlet(name = "ErrorServlet")
public class ErrorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print("登录失败！");
        writer.close();
    }
}
