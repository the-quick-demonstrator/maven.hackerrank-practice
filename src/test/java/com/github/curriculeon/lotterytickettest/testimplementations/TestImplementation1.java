package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;

public class TestImplementation1 implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new LotterySolution1();
    }
}