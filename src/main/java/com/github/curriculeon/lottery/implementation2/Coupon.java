package com.github.curriculeon.lottery.implementation2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Coupon implements Comparable<Coupon> {
    private final Integer ticketNumber;
    private final IntStream digits;

    public Coupon(Integer ticketNumber) {
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
    public int compareTo(Coupon o) {
        return this.getTicketNumber().compareTo(o.getTicketNumber());
    }
}