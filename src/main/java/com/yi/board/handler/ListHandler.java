package com.yi.board.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.board.model.ProjManagement;
import com.yi.board.mvc.CommandHandler;

import com.yi.board.service.ProjManagementService;

public class ListHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ProjManagementService service = ProjManagementService.getInstance();
		List<ProjManagement> list =  service.projManagementList();
		req.setAttribute("list", list);
		return "/WEB-INF/List.jsp";
	}

}
