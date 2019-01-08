package com.yi.board.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.board.mvc.CommandHandler;
import com.yi.board.service.ProjManagementService;

public class DeletHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ProjManagementService service = ProjManagementService.getInstance();
		String proj_no =req.getParameter("no");
		
		int result = service.delet(proj_no);
		req.setAttribute("result", result);
		res.sendRedirect("List.do");
		return null;
	}
	
}
