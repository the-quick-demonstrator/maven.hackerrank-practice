package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test70to79 extends LotteryTicketTestInterface {
    @Test
    default void test70to79() {
        // eight 3s expected in the 70s
        test(70, 1);
        test(71, 2);
        test(72, 3); // anomaly start point
        test(79, 3); // anomaly stop point
    }

    @Test
    default void test71() {
        test(71, 2);
    }

    @Test
    default void test72() {
        test(72, 3); // anomaly start point
    }

    @Test
    default void test79() {
        test(79, 3); // anomaly stop point
    }
}
