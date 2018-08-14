package com.copartner.service.impl;

import com.copartner.mapper.IUserMapper;
import com.copartner.model.User;
import com.copartner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public List selectAll() {
        return iUserMapper.selectAll();
    }
}
