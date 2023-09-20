package com.github.curriculeon.lotterytickettest;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import org.junit.Assert;

public interface LotteryTicketTestInterface {
    // given
    default void test(LotteryTicketSolutionInterface implementation, int numberOfLotteryTickets, int expected) {
        // when
        final int actual = implementation.getSizeOfListOfLargestNumberOfWinners(numberOfLotteryTickets);

        // then
        Assert.assertEquals(expected, actual);
    }
    default void test(int numberOfLotteryTickets, int expected) {
        test(getImplementation(), numberOfLotteryTickets, expected);
    }

    LotteryTicketSolutionInterface getImplementation();
}
