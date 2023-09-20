package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public interface Test100to200 extends LotteryTicketTestInterface {
    @Test
    default void test100to193() {
        // ten 1s expected in the 90s
        List<Integer> exceptions = Arrays.asList(107, 116, 125, 134, 143, 152, 161, 170, 190, 191, 192);
        for (int numberOfLotteryTickets = 100; numberOfLotteryTickets < 193; numberOfLotteryTickets++) {
            if (!exceptions.contains(numberOfLotteryTickets)) {
                test(numberOfLotteryTickets, 1);
            }
        }
        for(int exception : exceptions) {
            test(exception, 2);
        }
    }

}
