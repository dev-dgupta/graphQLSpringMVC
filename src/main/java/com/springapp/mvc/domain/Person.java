package com.springapp.mvc.domain;

/**
 * Created by Divya.Gupta on 19-06-2017.
 */
public class Person {

    int userid;
    String firstname;
    String lastname;
    String username;
    String url;
    String isactive;

    public Person() {
    }

    public Person(String firstname, String isactive, String lastname, String url, int userid, String username) {
        this.firstname = firstname;
        this.isactive = isactive;
        this.lastname = lastname;
        this.url = url;
        this.userid = userid;
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getUserid() != person.getUserid()) return false;
        if (getFirstname() != null ? !getFirstname().equals(person.getFirstname()) : person.getFirstname() != null)
            return false;
        if (getLastname() != null ? !getLastname().equals(person.getLastname()) : person.getLastname() != null)
            return false;
        if (getUsername() != null ? !getUsername().equals(person.getUsername()) : person.getUsername() != null)
            return false;
        if (getUrl() != null ? !getUrl().equals(person.getUrl()) : person.getUrl() != null) return false;
        return !(getIsactive() != null ? !getIsactive().equals(person.getIsactive()) : person.getIsactive() != null);

    }

    @Override
    public int hashCode() {
        int result = getUserid();
        result = 31 * result + (getFirstname() != null ? getFirstname().hashCode() : 0);
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
        result = 31 * result + (getIsactive() != null ? getIsactive().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", userid=" + userid +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", url='" + url + '\'' +
                ", isactive='" + isactive + '\'' +
                '}';
    }
}
