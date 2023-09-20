package com.github.curriculeon.lotterytickettest;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import org.junit.jupiter.api.Assertions;

public interface LotteryTicketTestInterface {
    // given
    default void test(LotteryTicketSolutionInterface implementation, int numberOfLotteryTickets, int expected) {
        System.out.println("=======================================");
        System.out.println("current implementation = " + implementation.getClass().getSimpleName());
        System.out.println("numberOfLotteryTickets = " + numberOfLotteryTickets);
        System.out.println("expected = " + expected);
        // when
        final int actual = implementation.getSizeOfListOfLargestNumberOfWinners(numberOfLotteryTickets);

        // then
        Assertions.assertEquals(expected, actual);
    }
    default void test(int numberOfLotteryTickets, int expected) {
        test(getImplementation(), numberOfLotteryTickets, expected);
    }

    LotteryTicketSolutionInterface getImplementation();
}
