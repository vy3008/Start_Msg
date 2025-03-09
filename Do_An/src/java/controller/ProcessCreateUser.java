package controller;

import dao.UserDAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;


public class ProcessCreateUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirm-password");
        
        boolean isValid = true;
        String message = null;
        if(!password.equals(confirmPassword)){
            message = "Mat khau khong trung";
            isValid = false;
        }
        
        boolean isExistUsername = UserDAO.isExistUsername(username);
        if(isExistUsername){
            message = "Tai khoan da ton tai";
            isValid = false;
        }
        User user = new User(username, password);
        boolean isCreated = UserDAO.insertUser(user);
        if(!isCreated){
            message = "Server error";
            isValid = false;
        }
        if(!isValid){
            request.setAttribute("message", message);
            RequestDispatcher dis = request.getRequestDispatcher("register.jsp");
            dis.forward(request, response);
        } else {
            response.sendRedirect("./login");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
