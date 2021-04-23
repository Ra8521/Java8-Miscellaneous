package com.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterStream {

public static void main(String[] args) {
        
        IntStream nums = IntStream.rangeClosed(0, 25);
        
        int[] vals = nums.filter(e -> e > 15).toArray();
        
        System.out.println(Arrays.toString(vals));
        
        
    }
}
