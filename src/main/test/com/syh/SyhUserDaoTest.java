package com.syh;

import com.syh.dao.AyUserDao;
import com.syh.model.AyUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: hui
 * @Date: 2019/3/17 14:07
 */
public class SyhUserDaoTest extends BaseJunit4Test {
    @Resource
    private AyUserDao ayUserDao;

    @Test
    public void testFindAll(){
        List<AyUser> userList=ayUserDao.findAll();
        System.out.println(userList.get(0).getName());
    }
}
