package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.Test;

public interface Test80to89 extends LotteryTicketTestInterface {
    @Test
    default void test80to89() {
        test(80, 1);
        test(81, 2); // anomaly start point
        test(89, 2); // anomaly stop point
    }

    @Test
    default void test80() {
        test(80, 1);
    }

    @Test
    default void test81() {
        test(81, 2); // anomaly start point
    }

    @Test
    default void test89() {
        test(89, 2); // anomaly stop point
    }
}