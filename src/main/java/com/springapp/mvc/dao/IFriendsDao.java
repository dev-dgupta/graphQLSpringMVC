package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Friends;

import java.util.List;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public interface IFriendsDao {

    List<Friends> getFriendsOfPerson(int userid);
}
