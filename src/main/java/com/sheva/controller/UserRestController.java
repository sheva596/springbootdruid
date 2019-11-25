package com.sheva.controller;

import com.sheva.pojo.User;
import com.sheva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sheva
 * @date 2019/11/25  下午3:39
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/api")
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean insert(@RequestBody User user) {
        System.out.println("开始新增...");
        return userService.insert(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean update(@RequestBody User user) {
        System.out.println("开始更新...");
        return userService.update(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestBody User user)  {
        System.out.println("开始删除...");
        return userService.delete(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        return userService.findByListEntity(user);
    }

}
