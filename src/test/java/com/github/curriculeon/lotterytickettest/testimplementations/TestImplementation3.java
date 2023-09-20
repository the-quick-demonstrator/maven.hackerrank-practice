package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation3.LotterySolution3;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;

public class TestImplementation3 implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new LotterySolution3();
    }
}
