package com.company.task4;

import java.util.stream.Stream;

/**
 * Created by Kateryna_Shkulova on 2/13/2019.
 */
public class Generator {
    private long seed;
    private long a;
    private long c;
    private long m;
    public Generator(){
        seed = 1;
        a = 25214903917L;
        c = 11;
        m = (long) Math.pow(2,48);
    }
    public Stream<Long> generate(){
        return Stream.iterate(seed, x->(a*x + c) % m);
    }
}