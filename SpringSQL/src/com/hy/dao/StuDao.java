package com.hy.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StuDao {

    private JdbcTemplate jdbcTemplate;
    public String stuDao(){
        String sql = "select name from user where id=?;";
        String name = jdbcTemplate.queryForObject(sql,new Object[]{"001"}, String.class);
        return name;

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
