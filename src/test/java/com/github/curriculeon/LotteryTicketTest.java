package com.github.curriculeon;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import org.junit.Assert;
import org.junit.Test;

public class LotteryTicketTest {
    // given
    private void test(int numberOfLotteryTickets, int expected) {
        System.out.println(new String(new char[25]).replaceAll(String.valueOf(Character.MIN_VALUE), "-"));
        System.out.println(numberOfLotteryTickets);
        final LotterySolution1 implementation = new LotterySolution1();

        // when
        final int actual = implementation.solution(numberOfLotteryTickets);

        // then
        Assert.assertEquals(expected, actual);
    }

    private void rangeTest(int start, int end) {
        final int offset = start - 1;
        for (int i = start; i < end; i++) {
            final int numberOfLotteryTickets = i;
            final int expected = numberOfLotteryTickets - offset;
            test(numberOfLotteryTickets, expected);
        }
    }

    @Test
    public void rangeTest() {
        rangeTest(1, 10);
        rangeTest(10, 19);
        rangeTest(20, 28);
        rangeTest(30, 37);
        rangeTest(40, 46);
        rangeTest(50, 55);
        rangeTest(60, 64);
        rangeTest(70, 73);
        rangeTest(80, 82);
        rangeTest(90, 91);
    }


    @Test
    public void test() {
        test(29, 8);
    }

    @Test
    public void test38() {
        test(38, 7);
    }

    @Test
    public void test39() {
        test(39, 7);
    }

    @Test
    public void test47() {
        test(47, 6);
    }

    @Test
    public void test48() {
        test(48, 6);
    }


    @Test
    public void test92() {
        test(92, 1);
    }

    @Test
    public void test93() {
        test(93, 1);
    }

    @Test
    public void test94() {
        test(94, 1);
    }

    @Test
    public void test100() {
        test(100, 1);
    }

    @Test
    public void test101() {
        test(101, 1);
    }
    @Test
    public void test102() {
        test(102, 1);
    }
}