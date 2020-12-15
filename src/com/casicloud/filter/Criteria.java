package com.casicloud.filter;

import java.util.List;

/**
 * @Author: lsc
 * @DATE: 2020/12/11 8:51
 * @Version: 1.0
 * @类功能:
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
