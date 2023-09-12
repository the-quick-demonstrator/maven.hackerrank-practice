package com.github.curriculeon.lottery.implementation1;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution1 implements LotteryTicketSolutionInterface {
    @Override
    public int solution(Integer numberOfLotteryTickets) {
        final LotteryTickets lotteryTickets = new LotteryTickets(numberOfLotteryTickets);
        System.out.println("getSumsAndRespectiveLotteryNumbers = " + lotteryTickets.getSumsAndRespectiveLotteryNumbers());
        System.out.println("getLargestNumberOfWinner = " + lotteryTickets.getLargestNumberOfWinners());
        System.out.println("getListOfLargestNumberOfWinners = " + lotteryTickets.getListOfLargestNumberOfWinners());
        return lotteryTickets.getListOfLargestNumberOfWinners().size();
    }
}
