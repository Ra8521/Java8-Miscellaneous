package com.Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class stream_of_Method {

	public static void main(String[] args) {

        Stream<String> colours = Stream.of("red", "green", "blue");
        String col = colours.skip(2).findFirst().get();    
        System.out.println(col);
        
        Stream<Integer> nums = Stream.of(3, 4, 5, 6, 7);
        int maxVal = nums.max(Comparator.naturalOrder()).get();
        System.out.println(maxVal);
    }
}