package com.sheva.dao.cluster;

import com.sheva.dao.BaseDao;
import com.sheva.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Sheva
 * @date 2019/11/25  下午3:26
 * @Version 1.0
 */
@Mapper
public interface StudentDao extends BaseDao<Student> {
}
