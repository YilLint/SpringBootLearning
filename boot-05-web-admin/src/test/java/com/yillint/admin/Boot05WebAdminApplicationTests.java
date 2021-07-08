package com.yillint.admin;

import com.yillint.admin.bean.User;
import com.yillint.admin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

//        jdbcTemplate.queryForObject("select * from user");
//        jdbcTemplate.queryForList("select * from user",);
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        log.info("记录数：{}",aLong);

        log.info("数据源类型:{}",dataSource.getClass());
    }

    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户下信息{}",user);
    }

}
