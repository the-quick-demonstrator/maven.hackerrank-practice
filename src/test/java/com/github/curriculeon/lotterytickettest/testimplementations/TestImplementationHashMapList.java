package com.github.curriculeon.lotterytickettest.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation1.HashMapListSolution;
import com.github.curriculeon.lotterytickettest.testcases.ImplementationTest;

public class TestImplementationHashMapList implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new HashMapListSolution();
    }
}