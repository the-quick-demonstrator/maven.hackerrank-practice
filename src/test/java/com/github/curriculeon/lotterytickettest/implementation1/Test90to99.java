package com.github.curriculeon.lotterytickettest.implementation1;

import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.Assert;
import org.junit.Test;

public interface Test90to99 extends LotteryTicketTestInterface {
    @Test
    default void test() {
        // ten 1s expected in the 90s
        test(90, 1);
        test(99, 1);
    }

    @Test
    default void test90() {
        test(90, 1);
    }

    @Test
    default void test99() {
        test(99, 1);
    }
}
