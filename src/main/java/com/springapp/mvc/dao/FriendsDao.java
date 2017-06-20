package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Friends;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Divya.Gupta on 19-06-2017.
 */

public class FriendsDao implements IFriendsDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Friends> getFriendsOfPerson(int userid) {
        String sql = "select * from friends where userid = ?";
        List<Friends> friendsList= jdbcTemplate.query(sql, new Object[]{userid}, new FriendsMapper());
        return friendsList;
    }
}
