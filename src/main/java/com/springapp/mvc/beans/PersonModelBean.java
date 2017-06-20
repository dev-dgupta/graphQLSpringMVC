package com.springapp.mvc.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public class PersonModelBean implements IBean {

    @SerializedName("userid")
    private int userid;
    @SerializedName("firstname")
    private String firstname;
    @SerializedName("lastname")
    private String lastname;
    @SerializedName("username")
    private String username;
    @SerializedName("isactive")
    private String isactive;
    @SerializedName("url")
    private String url;

    @SerializedName("friends")
    private List<PersonModelBean> friendList;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<PersonModelBean> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<PersonModelBean> friendList) {
        this.friendList = friendList;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PersonModelBean() {
    }
}
