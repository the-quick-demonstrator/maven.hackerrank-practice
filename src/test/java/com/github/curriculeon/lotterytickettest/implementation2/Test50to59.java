package com.github.curriculeon.lotterytickettest.implementation2;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class Test50to59 {
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
        test(50, 1);
        test(53, 4);
        test(54, 5); // anomaly start point
        test(59, 5); // anomaly stop point
    }

    @Test
    public void test50() {
        test(50, 1);
    }

    @Test
    public void test53() {
        test(53, 4);
    }

    @Test
    public void test54() {
        test(54, 5);
    }

    @Test
    public void test59() {
        test(59, 5);
    }

}
