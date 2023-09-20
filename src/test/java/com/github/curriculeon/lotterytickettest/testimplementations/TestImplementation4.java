package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation4.LotterySolution4;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;

public class TestImplementation4 implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new LotterySolution4();
    }
}
