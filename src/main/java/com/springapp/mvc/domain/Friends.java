package com.springapp.mvc.domain;

/**
 * Created by Divya.Gupta on 19-06-2017.
 */
public class Friends {

    int sno;
    int userid;
    int friendid;
    String isactive;

    public Friends() {
    }

    public Friends(int friendid, String isactive, int sno, int userid) {
        this.friendid = friendid;
        this.isactive = isactive;
        this.sno = sno;
        this.userid = userid;
    }

    public int getFriendid() {
        return friendid;
    }

    public void setFriendid(int friendid) {
        this.friendid = friendid;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friends)) return false;

        Friends friends = (Friends) o;

        if (getSno() != friends.getSno()) return false;
        if (getUserid() != friends.getUserid()) return false;
        if (getFriendid() != friends.getFriendid()) return false;
        return !(getIsactive() != null ? !getIsactive().equals(friends.getIsactive()) : friends.getIsactive() != null);

    }

    @Override
    public int hashCode() {
        int result = getSno();
        result = 31 * result + getUserid();
        result = 31 * result + getFriendid();
        result = 31 * result + (getIsactive() != null ? getIsactive().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "friendid=" + friendid +
                ", sno=" + sno +
                ", userid=" + userid +
                ", isactive='" + isactive + '\'' +
                '}';
    }
}
