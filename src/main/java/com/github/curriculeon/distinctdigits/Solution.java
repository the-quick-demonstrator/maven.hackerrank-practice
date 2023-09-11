package com.github.curriculeon.distinctdigits;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public Integer getAmountOfNumbersWithOnlyUniqueDigits(List<List<Integer>> input) {
        Set<Integer[]> allRecordeUniqueDigits = new HashSet<>();
        for(List<Integer> upperAndLowerBound : input) {
            int currentUpperBound = upperAndLowerBound.get(0);
            int currentLowerBound = upperAndLowerBound.get(1);
            NumberRange currentNumberRange = new NumberRange(currentUpperBound, currentLowerBound);
            Integer[] currentUniqueDigits = currentNumberRange.getValuesWithUniqueDigits();
            Arrays.sort(currentUniqueDigits); // ensure any permutation of these values are in an identical order
            allRecordeUniqueDigits.add(currentUniqueDigits);
        }
        return allRecordeUniqueDigits.size();
    }
}
