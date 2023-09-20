package com.github.curriculeon.lottery.implementation1;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class HashMapListSolution implements LotteryTicketSolutionInterface {
    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        final LotteryTicketEvaluator lotteryTickets = new LotteryTicketEvaluator(numberOfLotteryTickets);
        System.out.println("getLotteryTicketList = " + lotteryTickets.getLotteryTicketList());
        System.out.println("getSumsAndRespectiveLotteryNumbers = " + lotteryTickets.getSumsAndRespectiveLotteryNumbers());
        System.out.println("getLargestNumberOfWinner = " + lotteryTickets.getLargestNumberOfWinners());
        System.out.println("getListOfLargestNumberOfWinners = " + lotteryTickets.getListOfLargestNumberOfWinners());
        return lotteryTickets.getListOfLargestNumberOfWinners().size();
    }
}
