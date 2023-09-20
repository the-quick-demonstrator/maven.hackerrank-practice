package com.github.curriculeon.lottery.implementation4;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution4 implements LotteryTicketSolutionInterface {



    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        return new Solution(numberOfLotteryTickets).getSizeOfListOfLargestNumberOfWinners();
    }
}
