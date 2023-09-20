package com.github.curriculeon.lotterytickettest.testcases;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public interface Test100to200 extends LotteryTicketTestInterface {
    @Test
    default void test100to193() {
        // ten 1s expected in the 90s
        List<Integer> exceptions = Arrays.asList(107, 116, 125, 134, 143, 152, 161, 170, 190, 191, 192);
        for (int i = 100; i < 193; i++) {
            if (exceptions.contains(i)) {
                continue;
            }
            test(i, 1);
        }
    }

    @Test
    default void test107() {
        test(107, 2);
    }

    @Test
    default void test116() {
        test(116, 2);
    }

    @Test
    default void test134() {
        test(134, 2);
    }

    @Test
    default void test143() {
        test(143, 2);
    }

    @Test
    default void test152() {
        test(143, 2);
    }

    @Test
    default void test161() {
        test(143, 2);
    }
}
