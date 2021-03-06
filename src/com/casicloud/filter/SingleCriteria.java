package com.casicloud.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lsc
 * @DATE: 2020/12/11 8:53
 * @Version: 1.0
 * @类功能:
 **/
public class SingleCriteria implements  Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (Person person : personList) {
            if(person.getCriteriaStatus().equalsIgnoreCase("single")){
                personArrayList.add(person);
            }
        }
        return personArrayList;
    }
}
