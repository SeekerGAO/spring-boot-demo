package com.xkcoding.orm.jdbctemplate.controller;

import cn.hutool.core.util.IdUtil;
import com.xkcoding.orm.jdbctemplate.dao.UserDao;
import com.xkcoding.orm.jdbctemplate.entity.User;
import com.xkcoding.orm.jdbctemplate.service.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

  @Autowired
  private IUserService userService;

  private User user = new User();

  @Autowired
  JdbcTemplate jdbcTemplate;
  @Autowired
  private UserDao userDao;

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void save() {
    user.setName("gao");
    user.setPassword("123456");
    user.setEmail("gao@qq.com");
    user.setPhoneNumber("14718030333");
    user.setSalt(IdUtil.simpleUUID());
    userDao.insert(user);
  }

  @Test
  public void delete() {
    long id = 2;
    Boolean bool = userService.delete(id);
    System.out.println(bool);
  }

  @Test
  public void update() {
  }

  @Test
  public void getUser() {

  }

  @Test
  public void getUser1() {
  }
}
