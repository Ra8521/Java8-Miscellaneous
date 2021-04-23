package com.Stream;

import java.util.Random;
import java.util.stream.Stream;

public class stream_Iterate {

	 public static void main(String[] args) {
/**
 * The Stream.iterate() returns an infinite sequential ordered stream produced by
 *  iterative application of a function to an initial element. 
 * The initial element is called a seed
 */
	        Stream<Integer> s1 = Stream.iterate(5, n -> n * 2).limit(10);
	        s1.forEach(System.out::println);
/**
 * A stream of five random doubles is created with the Stream.generate() method.
 *  Each of the elements is multiplied by ten. In the end, 
 * we iterate over the stream and print each element to the console.
 */
	        Stream.generate(new Random()::nextDouble)
	                .map(e -> (e * 10))
	                .limit(5)
	                .forEach(System.out::println);        
	    }
	}