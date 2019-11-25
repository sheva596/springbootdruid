package com.sheva.dao.master;

import com.sheva.dao.BaseDao;
import com.sheva.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Sheva
 * @date 2019/11/25  下午3:26
 * @Version 1.0
 */
@Mapper
public interface UserDao extends BaseDao<User> {
}
