package com.company.task1;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Kateryna_Shkulova on 2/13/2019.
 */
public class Runner {

    public String run(List<String> names){
        return IntStream
                .range(0, names.size())
                .filter(i->i%2==1)
                .mapToObj(i->i + "." + names.get(i) + " ")
                .reduce((s1, s2)->s1+s2)
                .get();
    }
}
