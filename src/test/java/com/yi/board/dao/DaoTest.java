package com.yi.board.dao;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.yi.board.model.ProjManagement;
import com.yi.board.mvc.MySqlSessionFactory;

public class DaoTest {

	@Test
	public void testInsert() {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjManagementMapper dao = session.getMapper(ProjManagementMapper.class);

			ProjManagement projManagement = new ProjManagement();
			projManagement.setProj_no(1);
			projManagement.setProj_name("김쟈영");
			projManagement.setProj_cont("User4");
			projManagement.setStart_date(new Date());
			projManagement.setEnd_date(new Date());
			projManagement.setProgress("진행중");
			
			dao.insert(projManagement);

			session.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	
}
