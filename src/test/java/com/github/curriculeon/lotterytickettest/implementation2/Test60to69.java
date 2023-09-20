package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test60to69 {
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

        test(60, 1);
        test(62, 3);
        test(63, 4); // anomaly start point
        test(69, 4); // anomaly stop point
    }

    @Test
    public void test60() {
        test(60, 1);
    }

    @Test
    public void test62() {
        test(62, 3);
    }

    @Test
    public void test63() {
        test(63, 4);
    }

    @Test
    public void test69() {
        test(69, 4);
    }
}
