package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test90to99 {
    // given
    private void test(int numberOfLotteryTickets, int expected) {
        System.out.println(new String(new char[25]).replaceAll(String.valueOf(Character.MIN_VALUE), "-"));
        System.out.println(numberOfLotteryTickets);
        final LotterySolution1 implementation = new LotterySolution1();

        // when
        final int actual = implementation.getSizeOfListOfLargestNumberOfWinners(numberOfLotteryTickets);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        // ten 1s expected in the 90s
        test(90, 1);
        test(99, 1);
    }

    @Test
    public void test90() {
        test(90, 1);
    }

    @Test
    public void test99() {
        test(99, 1);
    }
}