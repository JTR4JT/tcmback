package com.jt.service.impl;

import com.jt.entity.User;
import com.jt.mapper.UserMapper;
import com.jt.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类-
 * </p>
 *
 * @author BXO
 * @since 2023-03-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;





}
