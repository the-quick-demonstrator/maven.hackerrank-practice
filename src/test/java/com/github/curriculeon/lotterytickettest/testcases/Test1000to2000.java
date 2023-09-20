package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public interface Test1000to2000 extends LotteryTicketTestInterface {
    @Test
    default void test1000to2000() {
        // ten 1s expected in the 90s
        List<Integer> exceptions = Arrays.asList(1038, 1039);
        for (int i = 1000; i < 2000; i++) {
            if (!exceptions.contains(i)) {
                test(i, 2);
            }
        }
    }
}
