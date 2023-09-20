package com.github.curriculeon.lottery.implementation2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Coupon implements Comparable<Coupon> {
    private final Integer ticketNumber;
    private final int ticketValue;

    public Coupon(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.ticketValue = Arrays
                .stream(ticketNumber.toString().split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public Integer getTicketValue() {
        return ticketValue;
    }

    @Override
    public int compareTo(Coupon o) {
        return this.getTicketNumber().compareTo(o.getTicketNumber());
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "ticketNumber=" + ticketNumber +
                ", sum=" + ticketValue +
                '}';
    }
}