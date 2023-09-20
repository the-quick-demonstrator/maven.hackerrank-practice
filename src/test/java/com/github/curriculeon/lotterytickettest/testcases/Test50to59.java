package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.Test;

public interface Test50to59 extends LotteryTicketTestInterface {
    
    @Test
    default void test50to59() {
        test(50, 1);
        test(53, 4);
        test(54, 5); // anomaly start point
        test(59, 5); // anomaly stop point
    }

    @Test
    default void test50() {
        test(50, 1);
    }

    @Test
    default void test53() {
        test(53, 4);
    }

    @Test
    default void test54() {
        test(54, 5);
    }

    @Test
    default void test59() {
        test(59, 5);
    }

}
