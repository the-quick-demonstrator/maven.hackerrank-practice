package com.github.curriculeon.lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CouponNumbers {
    private final List<LotteryTicket> lotteryTicketList;


    public CouponNumbers(int n) {
        this.lotteryTicketList = new ArrayList<>();
        IntStream
                .range(1, n)
                .forEach(ticketNumber -> lotteryTicketList.add(new LotteryTicket(ticketNumber)));
    }

    public Integer getLargestNumberOfWinners() {
        return null; // TODO
    }
}