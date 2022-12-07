package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PairFinding {

    @Test
    public void min() {
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        System.out.println(findDuplicateInStream(stream));
    }

    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream) {
        Set<T> items = new HashSet<>();
        return stream
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }



}
