package com.example.unitTests.Services;

import com.example.unitTests.DAO.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    public UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }

}
