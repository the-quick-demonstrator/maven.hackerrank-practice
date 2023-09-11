package com.github.curriculeon.lottery;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LotteryTicket implements Comparable<LotteryTicket> {
    private final Integer ticketNumber;
    private final IntStream digits;

    public LotteryTicket(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.digits = Arrays
                .stream(ticketNumber.toString().split(""))
                .mapToInt(Integer::parseInt);
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public int[] getDigits() {
        return digits.toArray();
    }

    public Integer getTicketValue() {
        return digits.sum();
    }

    @Override
    public int compareTo(LotteryTicket o) {
        return this.getTicketNumber().compareTo(o.getTicketNumber());
    }
}
