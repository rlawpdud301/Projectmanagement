package com.yi.board.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.board.model.ProjManagement;
import com.yi.board.mvc.CommandHandler;

import com.yi.board.service.ProjManagementService;

public class ReadHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ProjManagementService service = ProjManagementService.getInstance();
		String proj_no =req.getParameter("no");
		ProjManagement projManagement = service.selectByNo(proj_no);
		
		/*String up = (String)req.getParameter("up");
		System.out.println("up-"+up);
		if(req.getParameter("up")==null){
			System.out.println("read count update");
			int resut = service.updateCnt(artical);
		}else{
			System.out.println("read count not update");
			req.removeAttribute("up");
		}*/
		
		req.setAttribute("projManagement", projManagement);
		
		return "/WEB-INF/Read.jsp";
	}

}
