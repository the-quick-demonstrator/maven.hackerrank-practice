package com.github.curriculeon.lottery.implementation6;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class ArraySolution implements LotteryTicketSolutionInterface {
    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        return new TicketEvaluator(numberOfLotteryTickets).getSizeOfListOfLargestNumberOfWinners();
    }
}
