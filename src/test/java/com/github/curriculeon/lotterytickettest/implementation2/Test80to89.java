package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test80to89 {
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
        test(80, 1);
        test(81, 2); // anomaly start point
        test(89, 2); // anomaly stop point
    }

    @Test
    public void test80() {
        test(80, 1);
    }

    @Test
    public void test81() {
        test(81, 2); // anomaly start point
    }

    @Test
    public void test89() {
        test(89, 2); // anomaly stop point
    }
}