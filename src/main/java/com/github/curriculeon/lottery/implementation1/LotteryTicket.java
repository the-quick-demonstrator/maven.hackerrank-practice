package com.github.curriculeon.lottery.implementation1;

import java.util.ArrayList;
import java.util.List;

public class LotteryTicket implements Comparable<LotteryTicket> {
    private final Integer ticketNumber;
    private final List<Integer> digits;

    public LotteryTicket(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.digits = new ArrayList<>();
        for (String digitAsString : ticketNumber.toString().split("")) {
            Integer digitAsInteger = Integer.parseInt(digitAsString);
            digits.add(digitAsInteger);
        }
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public Integer getTicketDigitSum() {
        int sum = 0;
        for(int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    @Override
    public int compareTo(LotteryTicket o) {
        return this.getTicketNumber().compareTo(o.getTicketNumber());
    }
}
