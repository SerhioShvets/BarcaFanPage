package controllers;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccessObject;

@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public ValidationServlet() { 
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataAccessObject dao = new DataAccessObject();
		dao.addNewUserToDB(request.getParameter("name"),request.getParameter("email"), request.getParameter("password"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
