package com.github.curriculeon.lottery;

import java.util.*;

public class LotteryTickets {
    private final List<LotteryTicket> lotteryTicketList;


    public LotteryTickets(int numberOfLotteryTickets) {
        this.lotteryTicketList = new ArrayList<>();
        for (int ticketNumber = 1; ticketNumber < numberOfLotteryTickets; ticketNumber++) {
            lotteryTicketList.add(new LotteryTicket(ticketNumber));
        }
    }

    public Map<Integer, List<Integer>> getSumsAndRespectiveLotteryNumbers() {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (LotteryTicket lotteryTicket : lotteryTicketList) {
            final int lotteryTicketValue = lotteryTicket.getTicketDigitSum();
            final int lotteryTicketNumber = lotteryTicket.getTicketNumber();
            map.putIfAbsent(lotteryTicketNumber, new ArrayList<>());
            final List<Integer> lotteryTicketNumbers = map.get(lotteryTicketValue);
            lotteryTicketNumbers.add(lotteryTicket.getTicketNumber());
            map.put(lotteryTicketNumber, lotteryTicketNumbers);
        }
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