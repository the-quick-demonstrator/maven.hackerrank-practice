package com.github.curriculeon.lottery.implementation1;

import java.util.*;

public class LotteryTicketEvaluator {
    private final List<LotteryTicket> lotteryTicketList;
    private Map<Integer, List<Integer>> map;


    public LotteryTicketEvaluator(int numberOfLotteryTickets) {
        this.lotteryTicketList = new ArrayList<>();
        for (int ticketNumber = 1; ticketNumber <= numberOfLotteryTickets; ticketNumber++) {
            lotteryTicketList.add(new LotteryTicket(ticketNumber));
        }
    }

    public Map<Integer, List<Integer>> getSumsAndRespectiveLotteryNumbers() {
        if (map == null) {
            this.map = new HashMap<>();
            for (LotteryTicket lotteryTicket : lotteryTicketList) {
                final int lotteryTicketSum = lotteryTicket.getTicketDigitSum();
                final int lotteryTicketNumber = lotteryTicket.getTicketNumber();
                map.putIfAbsent(lotteryTicketSum, new ArrayList<>());
                final List<Integer> lotteryTicketNumbers = map.get(lotteryTicketSum);
                lotteryTicketNumbers.add(lotteryTicketNumber);
                map.put(lotteryTicketSum, lotteryTicketNumbers);
            }
        }
        return map;
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

    public List<LotteryTicket> getLotteryTicketList() {
        return lotteryTicketList;
    }
}