package com.macio.mybatisplus.service.impl;

import com.macio.mybatisplus.entity.User;
import com.macio.mybatisplus.mapper.UserMapper;
import com.macio.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yq
 * @since 2020-06-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
