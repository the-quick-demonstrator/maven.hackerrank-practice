package com.github.curriculeon.lottery.implementation3;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class ConcurrentHashMapSolution implements LotteryTicketSolutionInterface {



    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        return new LotteryCouponEvaluator(numberOfLotteryTickets).getSizeOfListOfLargestNumberOfWinners();
    }
}
