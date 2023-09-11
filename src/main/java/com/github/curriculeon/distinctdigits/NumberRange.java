package com.github.curriculeon.distinctdigits;

import java.util.*;

public class NumberRange {
    private List<Integer> theNumberRange = new ArrayList<>();

    public NumberRange(int min, int max) {
        for (int i = min; i < max; i++) {
            theNumberRange.add(i);
        }
    }

    public List<Integer> getUniques() {
        final List<Integer> result = new ArrayList<>();
        for (final Integer numberToEvaluate : theNumberRange) { // 101
            final String[] digits = numberToEvaluate.toString().split(""); // ["1", "0", "1"]
            final Set<String> uniqueDigits = new HashSet<>(Arrays.asList(digits)); // ["1", "0"]
            final boolean haveSameDigits = digits.length == uniqueDigits.size(); // ["1", "0", "1"].length == ["1", "0"].length
            if(haveSameDigits) {
                result.add(numberToEvaluate);
            }
        }
        return result;
    }
}
