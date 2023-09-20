package com.github.curriculeon.lottery.implementation3;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LotteryCouponEvaluator {
    private final Integer numberOfLotteryTickets;
    private ConcurrentHashMap<Integer, Integer> valueToSumMap;

    public LotteryCouponEvaluator(Integer numberOfLotteryTickets) {
        this.numberOfLotteryTickets = numberOfLotteryTickets;
    }

    public int getSizeOfListOfLargestNumberOfWinners() {
        if(numberOfLotteryTickets < 10) {
            return numberOfLotteryTickets;
        }
        // get number of occurrences of the values of each key
        final int largestNumberOfOccurrences = getLargestNumberOfOccurrences();
        final Map<Integer, Integer> valueAndSumMap = getValueToDigitalSumMap();
        final Collection<Integer> sumList = valueAndSumMap.values();
        for(Map.Entry<Integer, Integer> entry : valueAndSumMap.entrySet()) {
            final int sum = entry.getValue();
            // number of occurrences of each key
            final int numberOfOccurrences = Collections.frequency(sumList, sum);
            final boolean isLargestNumberOfOccurrences = numberOfOccurrences == largestNumberOfOccurrences;
            if (!isLargestNumberOfOccurrences) {
                valueAndSumMap.remove(entry.getKey());
            }
        }
        return valueAndSumMap.size() / getLargestNumberOfOccurrences();
    }

    public int getLargestNumberOfOccurrences() {
        // get number of occurrences of the values of each key
        final Map<Integer, Integer> valueToDigitalSumMap = getValueToDigitalSumMap();
        final Collection<Integer> values = valueToDigitalSumMap.values();
        int largestNumberOfOccurrences = Integer.MIN_VALUE;
        for (Integer value : values) {
            final int numberOfOccurrences = Collections.frequency(values, value);
            if (numberOfOccurrences > largestNumberOfOccurrences) {
                largestNumberOfOccurrences = numberOfOccurrences;
            }
        }
        return largestNumberOfOccurrences;
    }

    private Map<Integer, Integer> getValueToDigitalSumMap() {
        if (valueToSumMap == null) {
            this.valueToSumMap = new ConcurrentHashMap<>();
            for (Integer value = 1; value <= numberOfLotteryTickets; value++) {
                final List<String> digits = Arrays.asList(value.toString().split(""));
                final int sum = digits
                        .stream()
                        .mapToInt(Integer::valueOf)
                        .sum();
                valueToSumMap.put(value, sum);
            }
        }
        return valueToSumMap;
    }
}
