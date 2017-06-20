package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public class PersonMapper implements RowMapper<Person>{

    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setUserid(rs.getInt("userid"));
        person.setUsername(rs.getString("username"));
        person.setLastname(rs.getString("lastname"));
        person.setFirstname(rs.getString("firstname"));
        person.setUrl(rs.getString("url"));
        person.setIsactive(rs.getString("isactive"));

        return person;
    }
}
