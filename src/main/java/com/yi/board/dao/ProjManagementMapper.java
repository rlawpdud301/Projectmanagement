package com.yi.board.dao;

import java.sql.SQLException;
import java.util.List;

import com.yi.board.model.ProjManagement;

public interface ProjManagementMapper {
	
	public int insert(ProjManagement projManagement) throws SQLException;

	public List<ProjManagement> select() throws SQLException;

	public ProjManagement selectByNo(String proj_no) throws SQLException;

	public int delet(String proj_no) throws SQLException;

	public int update(ProjManagement projManagement) throws SQLException;
	
}
