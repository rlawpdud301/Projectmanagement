package com.yi.board.handler;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.board.model.ProjManagement;
import com.yi.board.mvc.CommandHandler;
import com.yi.board.service.ProjManagementService;

public class InsertHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			return "/WEB-INF/InsertForm.jsp";
		}else if (req.getMethod().equalsIgnoreCase("post")) {
			
			String proj_name = req.getParameter("proj_name");
			String proj_cont = req.getParameter("proj_cont");
			String start_date = req.getParameter("start_date");
			String end_date = req.getParameter("end_date");
			String progress = req.getParameter("progress");
			ProjManagement projManagement = new ProjManagement();
			projManagement.setProj_name(proj_name);
			projManagement.setProj_cont(proj_cont);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			projManagement.setStart_date(sdf.parse(start_date));
			projManagement.setEnd_date(sdf.parse(end_date));
			projManagement.setProgress(progress);
			
			ProjManagementService service = ProjManagementService.getInstance();
			int error = service.insert(projManagement);
			
			if (error < 0) {
				System.out.println("error"+error);
			} else {
				
				res.sendRedirect("List.do");
			}
		}
		return null;
	}
	

}
