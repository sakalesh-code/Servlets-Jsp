package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// Using RequestDispatcher
//		int k = (int) req.getAttribute("k");
//		k = k * k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);

		// Using sendRedirect
		// 1.URL Rewriting
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k * k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);

		// 2.Session
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
//		k = k * k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);

		// 3.cookie
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);

	}
}
