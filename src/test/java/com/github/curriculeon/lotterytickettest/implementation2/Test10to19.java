package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation2.LotterySolution2;
import org.junit.Assert;
import org.junit.Test;

public class Test10to19 {
    // given
    private void test(int numberOfLotteryTickets, int expected) {
        System.out.println(new String(new char[25]).replaceAll(String.valueOf(Character.MIN_VALUE), "-"));
        System.out.println(numberOfLotteryTickets);
        final LotterySolution2 implementation = new LotterySolution2();

        // when
        final int actual = implementation.getSizeOfListOfLargestNumberOfWinners(numberOfLotteryTickets);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        // two 9s expected in the 10s
        test(10, 1);
        test(11, 2);
        test(12, 3);
        test(13, 4);
        test(14, 5);
        test(15, 6);
        test(16, 7);
        test(17, 8);
        test(18, 9); // anomaly
        test(19, 9); // anomaly
    }

    @Test
    public void test10() {
        test(10, 1);
    }

    @Test
    public void test12() {
        test(12, 3);
    }

    @Test
    public void test17() {
        test(17, 8);
    }


    @Test
    public void test18() {
        test(18, 9);
    }


    @Test
    public void test19() {
        test(19, 9);
    }
}
