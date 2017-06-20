package com.springapp.mvc.service;

import com.springapp.mvc.beans.PersonModelBean;
import com.springapp.mvc.dao.IPersonDao;
import com.springapp.mvc.dao.IFriendsDao;
import com.springapp.mvc.domain.Friends;
import com.springapp.mvc.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
@Service
public class PersonService implements IPersonService {

    @Autowired
    private IPersonDao personDao;

    @Autowired
    private IFriendsDao friendsDao;

    @Override
    public PersonModelBean getPersonDetails(int userid) {

        Person person = personDao.getPersonObj(userid);
        if (null == person)
            return null;
        else {
            PersonModelBean personModelBean = getPersonModelBean(person);

            List<Friends> friendsList = friendsDao.getFriendsOfPerson(userid);
            if (null != friendsList) {
                List<PersonModelBean> personModelBeanList = new ArrayList<PersonModelBean>();
                for (Friends friends : friendsList) {
                    person = personDao.getPersonObj(friends.getFriendid());
                    if (null == person)
                        continue;
                    personModelBeanList.add(getPersonModelBean(person));
                }
                personModelBean.setFriendList(personModelBeanList);
            }

            return personModelBean;
        }
    }

    private PersonModelBean getPersonModelBean(Person person) {
        PersonModelBean personModelBean = new PersonModelBean();
        personModelBean.setFirstname(person.getFirstname());
        personModelBean.setLastname(person.getLastname());
        personModelBean.setUsername(person.getUsername());
        personModelBean.setUrl(person.getUrl());
        personModelBean.setIsactive(person.getIsactive());
        personModelBean.setUserid(person.getUserid());
        return personModelBean;
    }
}
