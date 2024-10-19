package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		// PrintWriter out = res.getWriter();
		// out.println("result is " + k);
		// Using RequestDispatcher
//		req.setAttribute("k", k);
//		RequestDispatcher rq = req.getRequestDispatcher("sq");
//		rq.forward(req, res);

		// Using sendRedirect()
		// 1.URL Rewriting
		// res.sendRedirect("sq?k=" + k);

		// 2.session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");

		// 3.cookie
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");

	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//
//		int k = i + j;
//		PrintWriter out = res.getWriter();
//		out.println("wynik: " + k);
//	}

//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		doGet(req, res);
//	}

}
