package com.github.curriculeon.lotterytickettest.implementation;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lotterytickettest.implementation1.MainTest;
import com.github.curriculeon.lotterytickettest.implementation1.Test1to9;
import com.github.curriculeon.lotterytickettest.implementation2.*;

public class TestImplementation1 implements MainTest, Test1to9, Test20to29, Test30to39, Test40to49, Test50to59, Test60to69, Test70to79, Test80to89, Test90to99 {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return null;
    }

    @Override
    public void patternTest() {
        MainTest.super.patternTest();
    }
}
