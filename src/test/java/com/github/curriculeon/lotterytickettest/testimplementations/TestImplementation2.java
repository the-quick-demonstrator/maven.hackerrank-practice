package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation2.LotterySolution2;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;

public class TestImplementation2 implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new LotterySolution2();
    }
}
