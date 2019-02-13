package com.company.task2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kateryna_Shkulova on 2/13/2019.
 */
public class Runner {
    public List<String > run(List<String> strList){
        return strList.stream()
                .map(String::toUpperCase)
                .sorted((x,y)->y.compareTo(x))
                .collect(Collectors.toList());
    }
}