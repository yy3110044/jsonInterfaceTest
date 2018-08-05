package com.yy.jsonInterfaceTest.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlTemplateController {
	
	@RequestMapping("/addUrl")
	public String addUrl(HttpServletRequest req) {
		req.setAttribute("projectId", req.getParameter("projectId"));
		return "addUrl";
	}
	
	@RequestMapping("/project")
	public String project(HttpServletRequest req) {
		req.setAttribute("projectId", req.getParameter("projectId"));
		return "project";
	}
}