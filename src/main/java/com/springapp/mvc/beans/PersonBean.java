package com.springapp.mvc.beans;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public class PersonBean {

    int userid;

    public PersonBean(int userid) {
        this.userid = userid;
    }

    public PersonBean() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
