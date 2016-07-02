package cn.qingtianr.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by jack on 16-6-4.
 */

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringApplicationConfiguration(classes = HomeController.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class HomeControllerTest {

    @Test
    public void testHome() throws Exception {

    }

    @Test
    public void testSignup() throws Exception {

    }

    @Test
    public void testCheckSignup() throws Exception {

    }

    @Test
    public void testSignin() throws Exception {

    }

    @Test
    public void testCheckSignin() throws Exception {

    }

    @Test
    public void testShowTheme() throws Exception {

    }
}