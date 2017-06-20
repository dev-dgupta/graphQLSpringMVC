package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Divya.Gupta on 19-06-2017.
 */
public class PersonDao implements IPersonDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();

        return persons;
    }

    public Person getPersonObj(int userid) {
        String sql = "select * from person where userid = ?";
        Person p = jdbcTemplate.queryForObject(sql, new Object[]{userid}, new PersonMapper());
        return p;
    }


}
