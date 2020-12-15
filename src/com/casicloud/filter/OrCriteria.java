package com.casicloud.filter;

import java.util.List;

/**
 * @Author: lsc
 * @DATE: 2020/12/11 9:01
 * @Version: 1.0
 * @类功能:
 **/
public class OrCriteria implements Criteria {
    private  Criteria firstCriteria;
    private  Criteria secondCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> fList = firstCriteria.meetCriteria(personList);
        List<Person> sList = secondCriteria.meetCriteria(personList);
        fList.addAll(sList);
        return fList;
    }
}
