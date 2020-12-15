package com.casicloud.filter;

import java.util.List;

/**
 * @Author: lsc
 * @DATE: 2020/12/11 8:58
 * @Version: 1.0
 * @类功能:
 **/
public class AndCriteria  implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> pList = firstCriteria.meetCriteria(personList);
        return secondCriteria.meetCriteria(pList);
    }
}
