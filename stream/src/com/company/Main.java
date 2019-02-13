package com.company;

import com.company.task3.Runner;
import com.company.task4.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
//        List<T> list1 = first.collect(Collectors.toList());
//        List<T> list2 = second.collect(Collectors.toList());
//        return IntStream.range(0, Math.min(list1.size(), list2.size() ))
//                .mapToObj(i -> Arrays.asList(list1.get(i), list2.get(i)))
//                .flatMap(a->a.stream());
        Iterator firstIter = first.iterator();
        Iterator secondIter = second.iterator();
        Stream result = Stream.empty();
        while (firstIter.hasNext() && secondIter.hasNext()){
            result = Stream.concat(result, Stream.of(firstIter.next(), secondIter.next()));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kate");
        names.add("Peter");
        names.add("Ivan");
        names.add("Vova");
        names.add("Olha");
        List<String> numbers = Arrays.asList("1,23,3", "4,5");
        //task1,2
        //System.out.println(new Runner().run(names));
        //task3
        //System.out.println(new Runner().run(numbers));
        //task4
        System.out.println(new Generator().generate().limit(10).collect(Collectors.toList()));
    }
}