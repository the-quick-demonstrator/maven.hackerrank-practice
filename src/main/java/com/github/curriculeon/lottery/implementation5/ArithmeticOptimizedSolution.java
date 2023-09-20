package com.github.curriculeon.lottery.implementation5;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class ArithmeticOptimizedSolution implements LotteryTicketSolutionInterface {

    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        if (numberOfLotteryTickets < 10) {
            return numberOfLotteryTickets;
        }
        if (numberOfLotteryTickets % 10 == 0) {
            return 1;
        }
        final int numberOfMysteryNumbers = (numberOfLotteryTickets / 10) + 1;
        final int firstMysteryNumberFound = (numberOfMysteryNumbers * 10) - numberOfMysteryNumbers;
        final int mysteryNumberResult = (10 - numberOfMysteryNumbers) + 1;
        if (firstMysteryNumberFound < numberOfLotteryTickets || firstMysteryNumberFound == numberOfLotteryTickets) {
            return Math.max(mysteryNumberResult, 1);
        } else {
            return Math.max(mysteryNumberResult - (firstMysteryNumberFound - numberOfLotteryTickets), 1);
        }
    }
}