package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import com.servlet.dao.Dao;

@SuppressWarnings("serial")
@Component("delQuesWithKeyType")
@WebServlet(displayName = "DelQuesWithKeyType", name = "DelQuesWithKeyType", urlPatterns = "/delQuesWithKeyType")
public class Demo extends HttpServlet {

	@Autowired
	public Dao dao;

	@Override
	//用Spring将Service注入到Servlet中
	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dao.selectList();
		PrintWriter out = response.getWriter();
		out.print("ok");
	}

}
