package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test30to39 {
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
        // two 9s expected in the 10s
        test(30, 1);
        test(31, 2);
        test(32, 3);
        test(33, 4);
        test(34, 5);
        test(35, 6);
        test(36, 7); // anomaly
        test(37, 7); // anomaly
        test(38, 7); // anomaly
        test(39, 7); // anomaly
    }

    @Test
    public void test30() {
        test(30, 1);
    }

    @Test
    public void test35() {
        test(35, 6);
    }

    @Test
    public void test36() {
        test(36, 7);
    }

    @Test
    public void test39() {
        test(39, 7);
    }

}
