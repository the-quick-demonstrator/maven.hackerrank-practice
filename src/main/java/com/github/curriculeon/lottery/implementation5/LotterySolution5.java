package com.github.curriculeon.lottery.implementation5;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution5 implements LotteryTicketSolutionInterface {



    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        return new Solution(numberOfLotteryTickets).getSizeOfListOfLargestNumberOfWinners();
    }
}
