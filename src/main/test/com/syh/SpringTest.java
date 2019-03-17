
package com.syh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


/**
 * @Author: hui
 * @Date: 2019/3/16 18:32
 */

@Service
public class SpringTest {
    @Test
    public  void testSpring(){
        //获取应用上下文
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest=(SpringTest)applicationContext.getBean("springTest");
        springTest.sayHello();
    }

    public void sayHello(){ System.out.println("hello syh");
    }
}

