package com.cjc.crud.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.dao.HomeDao;
import com.cjc.crud.model.Student;
import com.cjc.crud.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeDao hd;

	@Override
	public int saveuser(Student s) {

		return hd.saveuser(s);
	}

}
