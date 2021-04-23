package com.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class stream_File {

	public static void main(String[] args) throws IOException {
/* create a stream from a file. */
        Path path = Paths.get("/home/janbodnar/myfile.txt");
        Stream<String> stream = Files.lines(path);
        
        stream.forEach(System.out::println);
    }
}