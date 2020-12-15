package com.casicloud.flyweight.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 13:43
 * @Version: 1.0
 * @类功能:
 **/
public class SignUser1 {
    private String subject;
    private String location;

    public SignUser1(String subject, String location) {
        this.subject = subject;
        this.location = location;
    }

    public SignUser1() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SignUser1 signUser1 = (SignUser1) o;

        if (!subject.equals(signUser1.subject)) return false;
        return location.equals(signUser1.location);
    }

    @Override
    public int hashCode() {
        int result = subject.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }
}
