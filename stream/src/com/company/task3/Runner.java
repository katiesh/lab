package com.company.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kateryna_Shkulova on 2/13/2019.
 */
 public class Runner {
 public List<String> run(List<String> list){
 return list.stream()
 .flatMap(s-> Arrays.stream(s.split("\\s,\\s*")))
 .collect(Collectors.toList());
 }
 }