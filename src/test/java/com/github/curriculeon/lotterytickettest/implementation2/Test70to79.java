package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test70to79 {
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
        test(70, 1);
        test(71, 2);
        test(72, 3); // anomaly start point
        test(79, 3); // anomaly stop point
    }

    @Test
    public void test71() {
        test(71, 2);
    }

    @Test
    public void test72() {
        test(72, 3); // anomaly start point
    }

    @Test
    public void test79() {
        test(79, 3); // anomaly stop point
    }
}
