package com.casicloud.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 17:27
 * @Version: 1.0
 * @类功能:
 **/
public class Person  {
    private  String name;
    private  String sex;
    private  String criteriaStatus;

    public Person(String name, String sex, String criteriaStatus) {
        this.name = name;
        this.sex = sex;
        this.criteriaStatus = criteriaStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCriteriaStatus() {
        return criteriaStatus;
    }

    public void setCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", criteriaStatus='" + criteriaStatus + '\'' +
                '}';
    }
}
