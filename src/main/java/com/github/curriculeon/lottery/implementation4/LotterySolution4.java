package com.github.curriculeon.lottery.implementation4;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution4 implements LotteryTicketSolutionInterface {

    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        final boolean isLessThan10 = numberOfLotteryTickets < 10;
        if(isLessThan10) {
            return numberOfLotteryTickets;
        }
        final boolean isMultipleOf10 = numberOfLotteryTickets % 10 == 0;
        if (isMultipleOf10) {
            return 1;
        }
        final int scale = numberOfLotteryTickets / 10;
        final int numberOfMysteryNumbers = scale + 1;
        final int upperBound = numberOfMysteryNumbers * 10;
        final int firstMysteryNumberFound = upperBound - numberOfMysteryNumbers;
        final boolean isFirstMysteryNumberFound = firstMysteryNumberFound == numberOfLotteryTickets;
        final boolean isGreaterThanFirstMysteryNumberFound = firstMysteryNumberFound < numberOfLotteryTickets;
        final boolean isMysteryNumber = isFirstMysteryNumberFound || isGreaterThanFirstMysteryNumberFound;

        final int numberOfNonMysteryNumbers = 10 - numberOfMysteryNumbers;
        final int mysteryNumberResult = numberOfNonMysteryNumbers + 1;
        if (isMysteryNumber) {
            return mysteryNumberResult;
        } else {
            final int delta = firstMysteryNumberFound - numberOfLotteryTickets;
            return mysteryNumberResult - delta;
        }
    }
}