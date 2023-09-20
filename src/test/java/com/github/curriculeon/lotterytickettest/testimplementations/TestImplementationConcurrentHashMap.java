package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation4.ArithmeticSolution;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;
import org.junit.jupiter.api.Disabled;

public class TestImplementationConcurrentHashMap implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new ArithmeticSolution();
    }
}
