package com.syh.service.impl;

import com.syh.dao.AyUserDao;
import com.syh.model.AyUser;
import com.syh.service.AyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: hui
 * @Date: 2019/3/17 10:05
 */
@Service
public class AyUserServiceImpl implements AyUserService {

    @Resource
    private AyUserDao ayUserDao;
    @Override
    public List<AyUser> findAll() {
        return ayUserDao.findAll();
    }
}
