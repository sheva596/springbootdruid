package com.sheva.service.impl;

import com.sheva.dao.BaseDao;
import com.sheva.dao.cluster.StudentDao;
import com.sheva.pojo.Student;
import com.sheva.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
* 用户操作实现类
 * @author sheva
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	protected BaseDao<Student> getMapper() {
		return this.studentDao;
	}
	
}
