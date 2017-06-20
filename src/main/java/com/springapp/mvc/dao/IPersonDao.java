package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Person;

import java.util.List;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public interface IPersonDao {

    List<Person> getAllPersons();

    Person getPersonObj(int userid);


}
