package com.marongxin.demo.service.impl;

import com.marongxin.demo.dao.UserDao;
import com.marongxin.demo.entity.User;
import com.marongxin.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectUsers() {
        return userDao.findAllUser();
    }
}
