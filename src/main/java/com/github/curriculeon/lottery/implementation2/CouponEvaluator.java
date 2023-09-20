package com.github.curriculeon.lottery.implementation2;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CouponEvaluator {
    private final Stream<Coupon> lotteryTicketStream;
    private Map<Integer, List<Integer>> map;


    public CouponEvaluator(int n) {
        this.lotteryTicketStream = IntStream
                .range(1, n + 1)
                .mapToObj(Coupon::new);
    }

    public Map<Integer, List<Integer>> getSumsAndRespectiveLotteryNumbers() {
        if (this.map == null) {
            this.map = new HashMap<>();
            lotteryTicketStream.forEach(lotteryTicket -> {
                final int lotteryTicketSum = lotteryTicket.getTicketValue();
                final int lotteryTicketNumber = lotteryTicket.getTicketNumber();
                map.putIfAbsent(lotteryTicketSum, new ArrayList<>());
                final List<Integer> lotteryTicketNumbers = map.get(lotteryTicketSum);
                lotteryTicketNumbers.add(lotteryTicketNumber);
                map.put(lotteryTicketSum, lotteryTicketNumbers);
            });
        }
        return this.map;
    }

    public Integer getLargestNumberOfWinners() {
        List<Map.Entry<Integer, List<Integer>>> sortable = new ArrayList<>(getSumsAndRespectiveLotteryNumbers().entrySet());
        sortable.sort((entry1, entry2) -> {
            int size1 = entry1.getValue().size();
            int size2 = entry2.getValue().size();
            return Integer.compare(size2, size1);
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
}