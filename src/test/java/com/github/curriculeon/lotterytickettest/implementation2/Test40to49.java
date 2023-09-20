package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test40to49 {
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
        // five 6s expected in the 40s
        test(40, 1);
        test(45, 6); // anomaly
        test(46, 6); // anomaly
        test(47, 6); // anomaly
        test(48, 6); // anomaly
        test(49, 6); // anomaly
    }

    @Test
    public void test10() {
        test(40, 1);
    }

    @Test
    public void test44() {
        test(44, 5);
    }

    @Test
    public void test45() {
        test(45, 6);
    }

    @Test
    public void test46() {
        test(46, 6);
    }


    @Test
    public void test49() {
        test(49, 6); // anomaly
    }


    @Test
    public void test19() {
        test(19, 9);
    }
}
