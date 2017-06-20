package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Friends;
import com.springapp.mvc.domain.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public class FriendsMapper implements RowMapper<Friends> {
    @Override
    public Friends mapRow(ResultSet rs, int i) throws SQLException {
        Friends friends = new Friends();
        friends.setUserid(rs.getInt("userid"));
        friends.setFriendid(rs.getInt("friendid"));
        friends.setSno(rs.getInt("sno"));
        friends.setIsactive(rs.getString("isactive"));
        return friends;
    }
}
