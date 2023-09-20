package com.github.curriculeon.lottery.implementation3;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution3 implements LotteryTicketSolutionInterface {

    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        final boolean isGreaterThan100 = numberOfLotteryTickets > 100;
        final boolean isLessThan10 = numberOfLotteryTickets < 10;
        final boolean isMultipleOf10 = numberOfLotteryTickets % 10 == 0;
        final boolean shouldReturn1 = isLessThan10 || isMultipleOf10 || isGreaterThan100;
        if (shouldReturn1) {
            return 1;
        }
        final int magnitude = numberOfLotteryTickets / 10;
        final int lowerBound = magnitude * 10;
        final int upperBound = (magnitude + 1) * 10;
        Integer firstMysteryNumberFound = null;
        for (int i = lowerBound; i < upperBound; i++) {
            boolean isCurrentMysteryNumber = i % 9 == 0;
            if (isCurrentMysteryNumber) {
                firstMysteryNumberFound = i;
                break;
            }
        }
        final boolean isFirstMysteryNumberFound = firstMysteryNumberFound == numberOfLotteryTickets;
        final boolean isGreaterThanFirstMysteryNumberFound = firstMysteryNumberFound < numberOfLotteryTickets;
        final boolean isMysteryNumber = isFirstMysteryNumberFound || isGreaterThanFirstMysteryNumberFound;
        final int numberOfMysteryNumbers = magnitude + 1;
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