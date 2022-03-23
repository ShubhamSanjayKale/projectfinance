package com.cjc.crud.daoImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.crud.dao.HomeDao;
import com.cjc.crud.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao 
{
	@Autowired
	SessionFactory sf;
	

	@Override
	public int saveuser(Student s)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		int id = (Integer) session.save(s);
		tr.commit();
		session.close();
		
		return id;
	}

}
