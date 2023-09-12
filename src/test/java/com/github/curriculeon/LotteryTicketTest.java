package com.github.curriculeon;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import com.github.curriculeon.lottery.implementation1.LotteryTickets;
import org.junit.Assert;
import org.junit.Test;

public class LotteryTicketTest {
    // given
    private void test(LotterySolution1 implementation, int numberOfLotteryTickets, int expected) {
        // given
        int actual = implementation.solution(numberOfLotteryTickets);

        // then
        Assert.assertEquals(expected, actual);
    }

    private void test(int input, int expected) {
        test(new LotterySolution1(), input, expected);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test1() {
        for (int i = 0; i < 9; i++) {
            test(i, i);
        }
    }

    @Test
    public void test2() {
        test(11, 2);
    }

    @Test
    public void test3() {
        test(12, 3);
    }

    @Test
    public void test4() {
        test(13, 4);
    }

    @Test
    public void test5() {
        test(14, 5);
    }

    @Test
    public void test6() {
        test(15, 6);
    }

    @Test
    public void test7() {
        test(16, 7);
    }

    @Test
    public void test8() {
        test(19, 9);
    }

    @Test
    public void test10() {
        test(20, 1);
    }

    @Test
    public void test11() {
        test(21, 2);
    }
    @Test
    public void test12() {
        test(22, 3);
    }

}
