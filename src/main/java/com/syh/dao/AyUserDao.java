package com.syh.dao;

import com.syh.model.AyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hui
 * @Date: 2019/3/17 10:02
 */
@Repository
public interface AyUserDao {
    List<AyUser> findAll();
}
