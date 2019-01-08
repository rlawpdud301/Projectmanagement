package com.yi.board.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;


import com.yi.board.dao.ProjManagementMapper;

import com.yi.board.model.ProjManagement;

import com.yi.board.mvc.MySqlSessionFactory;

public class ProjManagementService{
	private static ProjManagementService service = new ProjManagementService();

	public static ProjManagementService getInstance() {
		return service;
	}
	public int insert(ProjManagement projManagement) {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjManagementMapper daoMember = session.getMapper(ProjManagementMapper.class);
			int result = daoMember.insert(projManagement);

			session.commit();
			return 0;

		} catch (Exception e) {
			session.rollback();// inser과정에 sqlException발생하면 rollback처리함
			e.printStackTrace();

		} finally {
			session.close();
		}
		return -4;
	}
	public List<ProjManagement> projManagementList() {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjManagementMapper dao = session.getMapper(ProjManagementMapper.class);

			return dao.select();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	public ProjManagement selectByNo(String proj_no) {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjManagementMapper Dao = session.getMapper(ProjManagementMapper.class);
			
			ProjManagement management = Dao.selectByNo(proj_no);
			
			return management;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	public int delet(String proj_no) {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjManagementMapper dao = session.getMapper(ProjManagementMapper.class);

			int result = dao.delet(proj_no);
			if (result < 0) {
				return -1;
			}
			session.commit();
			return 1;

		} catch (Exception e) {
			session.rollback();// inser과정에 sqlException발생하면 rollback처리함
			e.printStackTrace();

		} finally {
			session.close();
		}
		return -4;
	}
	public int update(ProjManagement projManagement) {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjManagementMapper daoMember = session.getMapper(ProjManagementMapper.class);
			int result = daoMember.update(projManagement);

			session.commit();
			return 0;

		} catch (Exception e) {
			session.rollback();// inser과정에 sqlException발생하면 rollback처리함
			e.printStackTrace();

		} finally {
			session.close();
		}
		return -4;

	}
	
}
