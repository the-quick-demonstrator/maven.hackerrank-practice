package com.github.curriculeon.distinctdigits;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public Integer getAmountOfNumbersWithOnlyUniqueDigits(final List<List<Integer>> input) {
        final Set<Integer[]> allRecordeUniqueDigits = new HashSet<>();
        for(final List<Integer> upperAndLowerBound : input) {
            final int currentUpperBound = upperAndLowerBound.get(0);
            final int currentLowerBound = upperAndLowerBound.get(1);
            final NumberRange currentNumberRange = new NumberRange(currentUpperBound, currentLowerBound);
            final Integer[] currentUniqueDigits = currentNumberRange.getValuesWithUniqueDigits();
            Arrays.sort(currentUniqueDigits); // ensure any permutation of these values are in an identical order
            allRecordeUniqueDigits.add(currentUniqueDigits);
        }
        return allRecordeUniqueDigits.size();
    }
}
