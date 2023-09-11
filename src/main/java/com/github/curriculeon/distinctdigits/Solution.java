package com.github.curriculeon.distinctdigits;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public Integer getAmountOfNumbersWithOnlyUniqueDigits(final List<List<Integer>> input) {
        // create a list
        final Set<Integer> numbersWithOnlyUniqueDigits = new HashSet<>();
        // for each list in the lists
        for (List<Integer> upperAndLowerBounds : input) { // ----- start for loop
            // get min bound of current list
            int min = upperAndLowerBounds.get(0);
            // get max bound of current list
            int max = upperAndLowerBounds.get(1);
            // get range from min to max
            NumberRange numberRange = new NumberRange(min, max); // [1,10], [2,10]
            // filter range for only uniques
            List<Integer> uniques = numberRange.getUniques(); //

            // add uniques to a list
            numbersWithOnlyUniqueDigits.addAll(uniques);
        }
        // ----- end for loop

        // get size of list
        final int listSize = numbersWithOnlyUniqueDigits.size();

        // return size
        return listSize;
    }
}
