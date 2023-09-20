package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public interface Test200to300 extends LotteryTicketTestInterface {
    @Test
    default void test200to282() {
        // ten 1s expected in the 90s
        List<Integer> exceptions = Arrays.asList(207, 216, 225, 234, 243, 252, 261, 270, 280, 281, 282);
        for (int i = 200; i < 283; i++) {
            if (!exceptions.contains(i)) {
                test(i, 2);
            }
        }
    }
}
