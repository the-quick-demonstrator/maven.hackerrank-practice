package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation5.ArithmeticOptimizedSolution;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;
import org.junit.jupiter.api.Disabled;

public class TestImplementationArithmeticOptimized implements ImplementationTest {

    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new ArithmeticOptimizedSolution();
    }
}
