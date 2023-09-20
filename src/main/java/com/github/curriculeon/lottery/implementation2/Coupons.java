package com.github.curriculeon.lottery.implementation2;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Coupons {
    private final Stream<Coupon> lotteryTicketStream;
    private Map<Integer, List<Integer>> sumToLotteryNumberMap;


    public Coupons(int n) {
        this.lotteryTicketStream = IntStream
                .range(1, n + 1)
                .mapToObj(Coupon::new);
    }

    public Map<Integer, List<Integer>> getSumsAndRespectiveLotteryNumbers() {
        if (this.sumToLotteryNumberMap == null) {
            this.sumToLotteryNumberMap = new HashMap<>();
            lotteryTicketStream.forEach(lotteryTicket -> {
                final int lotteryTicketValue = lotteryTicket.getTicketValue();
                final int lotteryTicketNumber = lotteryTicket.getTicketNumber();
                sumToLotteryNumberMap.putIfAbsent(lotteryTicketNumber, new ArrayList<>());
                final List<Integer> lotteryTicketValues = sumToLotteryNumberMap.get(lotteryTicketValue);
                lotteryTicketValues.add(lotteryTicket.getTicketNumber());
                sumToLotteryNumberMap.put(lotteryTicketNumber, lotteryTicketValues);
            });
        }
        return this.sumToLotteryNumberMap;
    }

    public Integer getLargestNumberOfWinners() {
        List<Map.Entry<Integer, List<Integer>>> sortable = new ArrayList<>(getSumsAndRespectiveLotteryNumbers().entrySet());
        sortable.sort((entry1, entry2) -> {
            int size1 = entry1.getValue().size();
            int size2 = entry2.getValue().size();
            return Integer.compare(size1, size2);
        });
        return sortable.get(0).getValue().size();
    }


    public Set<Map.Entry<Integer, List<Integer>>> getListOfLargestNumberOfWinners() {
        Set<Map.Entry<Integer, List<Integer>>> result = new HashSet<>();
        final int largestNumberNumberWinners = getLargestNumberOfWinners();
        final Map<Integer, List<Integer>> sumsAndRespectiveLotteryNumbers = getSumsAndRespectiveLotteryNumbers();
        for (Map.Entry<Integer, List<Integer>> entry : sumsAndRespectiveLotteryNumbers.entrySet()) {
            if (entry.getValue().size() == largestNumberNumberWinners) {
                result.add(entry);
            }
        }
        return result;
    }

    public List<Coupon> getLotteryTicketStream() {
        return Stream.concat(lotteryTicketStream, Stream.empty()).collect(Collectors.toList());
    }
}