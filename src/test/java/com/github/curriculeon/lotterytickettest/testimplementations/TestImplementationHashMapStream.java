package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation2.HashMapStreamSolution;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;

public class TestImplementationHashMapStream implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new HashMapStreamSolution();
    }
}
