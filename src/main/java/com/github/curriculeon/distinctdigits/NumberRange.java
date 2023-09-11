package com.github.curriculeon.distinctdigits;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberRange {

    private final Stream<Integer> values;

    public NumberRange(int lowerbound, int upperbound) {
        this.values = IntStream.range(lowerbound, upperbound).boxed();
    }

    public Integer[] getValuesWithUniqueDigits() {
        return values
                .filter(value -> {
                    String[] allDigits = value.toString().split("");
                    Set<String> uniqueDigits = new HashSet<>(Arrays.asList(allDigits));
                    boolean hasUniqueDigits = allDigits.length == uniqueDigits.size();
                    return hasUniqueDigits;
                })
                .toArray(Integer[]::new);
    }
}
