package com.casicloud.filter;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lsc
 * @DATE: 2020/12/11 9:06
 * @Version: 1.0
 * @类功能:
 **/
public class OrderCriteria {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        FeMaleCriteria fMCriteria = new FeMaleCriteria();
        MaleCriteria mCriteria = new MaleCriteria();
        SingleCriteria singleCriteria = new SingleCriteria();
        AndCriteria andCriteria = new AndCriteria(fMCriteria, singleCriteria);
        OrCriteria orCriteria = new OrCriteria(mCriteria, singleCriteria);
        getCriteria(orCriteria.meetCriteria(persons));
        System.out.println("------------");
        getCriteria(andCriteria.meetCriteria(persons));
    }
    public static void getCriteria(List<Person> personList){
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}
