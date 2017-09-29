package com.ren.edas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ren.edas.SampleService;

public class HsfServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
		SampleService sampleService = (SampleService) ctx.getBean("sampleService");
		String params=req.getParameter("params");
		String resultStr=sampleService.echo(params);
		resp.getWriter().println(Long.toString(System.currentTimeMillis())+" result:"+resultStr);
		

	}
}
