package com.github.curriculeon.lottery.implementation2;


import com.github.curriculeon.lottery.implementation1.LotteryTicket;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Coupons {
    private final List<LotteryTicket> lotteryTicketList;


    public Coupons(int n) {
        this.lotteryTicketList = IntStream
                .range(1, n)
                .mapToObj(LotteryTicket::new)
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Integer>> getSumsAndRespectiveLotteryNumbers() {
        Map<Integer, List<Integer>> map = new HashMap<>();
        lotteryTicketList.forEach(lotteryTicket -> {
            final int lotteryTicketValue = lotteryTicket.getTicketDigitSum();
            final int lotteryTicketNumber = lotteryTicket.getTicketNumber();
            map.putIfAbsent(lotteryTicketNumber, new ArrayList<>());
            final List<Integer> lotteryTicketValues = map.get(lotteryTicketValue);
            lotteryTicketValues.add(lotteryTicket.getTicketNumber());
            map.put(lotteryTicketNumber, lotteryTicketValues);
        });
        return map;
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
}