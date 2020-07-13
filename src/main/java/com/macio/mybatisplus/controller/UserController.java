package com.macio.mybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macio.mybatisplus.entity.User;
import com.macio.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yq
 * @since 2020-06-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public IPage<User> findList(HttpServletRequest request){
        Integer pageNo = Integer.valueOf(request.getParameter("pageNo"));
        Integer pageSize = Integer.valueOf(request.getParameter("pageSize"));
        IPage<User> page = new Page<>(pageNo, pageSize);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        User user = new User();
//        user.setId(1l);
        wrapper.like("name","J");
        wrapper.setEntity(user);
        return userService.page(page,wrapper);
    }

}
