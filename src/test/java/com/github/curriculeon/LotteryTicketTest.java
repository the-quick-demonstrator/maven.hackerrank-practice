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
    public void test12() {
        test(12, 3);
    }


    @Test
    public void patternDemo() {
        // two 9s expected in the 10s
        test(10, 1);
        test(11, 2);
        test(12, 3);
        test(13, 4);
        test(14, 5);
        test(15, 6);
        test(17, 8);
        test(18, 9);
        test(19, 9);

        // three 8s expected in the 20s
        test(20, 1);
        test(27, 8);
        test(28, 8);
        test(29, 8);

        // four 7s expected in the 30s
        test(32, 3);
        test(33, 4);
        test(34, 5);
        test(35, 6);
        test(36, 7);
        test(37, 7);
        test(38, 7);
        test(39, 7);

        // five 6s expected in the 40s
        test(40, 1);
        test(47, 6);
        test(48, 6);
        test(49, 6);

        test(50, 1);
        test(53, 4);
        test(54, 5);
        test(55, 5);
        test(57, 5);
        test(58, 5);

        test(68, 4);
        test(78, 3);
        test(88, 2);
        test( 98, 1);

        test(100, 1);
        test(108, 1);
        test(118, 1);
        test(1222, 1);


    }

    @Test
    public void test29() {
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