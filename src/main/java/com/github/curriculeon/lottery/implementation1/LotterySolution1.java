package com.github.curriculeon.lottery.implementation1;

import com.github.curriculeon.lottery.SolutionInterface;

public class LotterySolution1 implements SolutionInterface {
    @Override
    public int solution(int numberOfLotteryTickets) {
        final LotteryTickets lotteryTickets = new LotteryTickets(numberOfLotteryTickets);
        System.out.println(lotteryTickets.getSumsAndRespectiveLotteryNumbers());
        System.out.println(lotteryTickets.getLargestNumberOfWinners());
        return lotteryTickets.getTotalNumberOfLargestNumberOfWinners();
    }
}
