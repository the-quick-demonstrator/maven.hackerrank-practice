package com.github.curriculeon.lotterytickettest.implementation1;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.Test;

public interface Test1to9 extends LotteryTicketTestInterface {
    @Test
    default void patternTest() {
        // nine 1s expected in the 0s
        for (int i = 1; i < 9; i++) {
            test(i, 1);
        }
    }
}
