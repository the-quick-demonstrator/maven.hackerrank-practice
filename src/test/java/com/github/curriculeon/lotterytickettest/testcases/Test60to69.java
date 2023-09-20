package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test60to69 extends LotteryTicketTestInterface {
    @Test
    default void test60to69() {
        test(60, 1);
        test(62, 3);
        test(63, 4); // anomaly start point
        test(69, 4); // anomaly stop point
    }

    @Test
    default void test60() {
        test(60, 1);
    }

    @Test
    default void test62() {
        test(62, 3);
    }

    @Test
    default void test63() {
        test(63, 4);
    }

    @Test
    default void test69() {
        test(69, 4);
    }
}
