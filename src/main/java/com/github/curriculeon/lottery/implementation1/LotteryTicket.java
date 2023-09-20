package com.github.curriculeon.lottery.implementation1;

import java.util.ArrayList;
import java.util.List;

public class LotteryTicket implements Comparable<LotteryTicket> {
    private final Integer ticketNumber;
    private final int ticketValue;

    public LotteryTicket(Integer ticketNumber) {
        int sum = 0;
        for (String digitAsString : ticketNumber.toString().split("")) {
            Integer digitAsInteger = Integer.parseInt(digitAsString);
            sum += digitAsInteger;
        }
        this.ticketValue = sum;
        this.ticketNumber = ticketNumber;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public Integer getTicketDigitSum() {
        return ticketValue;
    }

    @Override
    public int compareTo(LotteryTicket o) {
        return this.getTicketNumber().compareTo(o.getTicketNumber());
    }

    @Override
    public String toString() {
        return "{" +
                "ticketNumber=" + ticketNumber +
                ", sum=" + getTicketDigitSum() +
                '}';
    }
}
