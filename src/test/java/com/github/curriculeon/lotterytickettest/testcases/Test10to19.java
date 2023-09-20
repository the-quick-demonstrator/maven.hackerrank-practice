package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test10to19 extends LotteryTicketTestInterface {
    // given
    @Test
    default void test() {
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
    default void test10() {
        test(10, 1);
    }

    @Test
    default void test12() {
        test(12, 3);
    }

    @Test
    default void test17() {
        test(17, 8);
    }


    @Test
    default void test18() {
        test(18, 9);
    }


    @Test
    default void test19() {
        test(19, 9);
    }
}
