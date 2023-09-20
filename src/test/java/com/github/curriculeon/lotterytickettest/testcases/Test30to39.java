package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.Test;

public interface Test30to39 extends LotteryTicketTestInterface {
    @Test
    default void test30to39() {
        // two 9s expected in the 10s
        test(30, 1);
        test(31, 2);
        test(32, 3);
        test(33, 4);
        test(34, 5);
        test(35, 6);
        test(36, 7); // anomaly
        test(37, 7); // anomaly
        test(38, 7); // anomaly
        test(39, 7); // anomaly
    }

    @Test
    default void test30() {
        test(30, 1);
    }

    @Test
    default void test35() {
        test(35, 6);
    }

    @Test
    default void test36() {
        test(36, 7);
    }

    @Test
    default void test39() {
        test(39, 7);
    }

}
