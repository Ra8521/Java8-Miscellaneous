package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("pen", "coin", "desk", "chair");

        String word = words.stream().findFirst().get();
        System.out.println(word);
        
        List<String> filterWord = words.stream().filter(w->!"coin".equals(w)).collect(Collectors.toList());
        System.out.println(filterWord);
        
        /*create a stream from an array.*/
        Stream<String> letters = Arrays.stream(new String[]{ "a", "b", "c"});    
        
        /*count() method of the stream returns the number of elements in the stream.*/
        System.out.printf("There are %d letters%n", letters.count());
        
        String day = "Sunday";
        
 /* codePoints() method of IntStream class is 
  * used to get a stream of code point values from the given sequence
  * It returns the ASCII values of the characters passed as an argument
  * */
 
      IntStream istr = day.codePoints();
        
        String s = istr.filter(e -> e != 'n').collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(s);
    }
}
