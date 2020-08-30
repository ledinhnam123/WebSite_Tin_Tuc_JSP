package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.UserModel;



@WebServlet(urlPatterns = {"/trang-chu"}) //tao ra 1 cai mang
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 2686801510274002166L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setFullName("hello world");
		request.setAttribute("model",userModel);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");//truyen vo cai view muon tra ve
		rd.forward(request, response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}