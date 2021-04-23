package com.Stream;

import java.util.Arrays;
import java.util.List;

public class stream_Iteration {

	public static void main(String[] args) {

        List<String> words = Arrays.asList("pen", "coin", "desk",
                "eye", "bottle");
        
        words.stream().forEach(System.out::println);
    }
}

