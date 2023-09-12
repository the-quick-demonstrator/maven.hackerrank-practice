package com.github.curriculeon.lottery.implementation1;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution1 implements LotteryTicketSolutionInterface {
    @Override
    public int solution(int numberOfLotteryTickets) {
        final LotteryTickets lotteryTickets = new LotteryTickets(numberOfLotteryTickets);
        return lotteryTickets.getListOfLargestNumberOfWinners().size();
    }
}
