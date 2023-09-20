package com.github.curriculeon.lottery.implementation4;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

import java.util.HashMap;
import java.util.Map;

public class LotterySolution4 implements LotteryTicketSolutionInterface {
    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        final String numberOfLotteryTicketsStr = numberOfLotteryTickets.toString();
        final int numberOfDigits = numberOfLotteryTicketsStr.length();
        final int lastIndex = numberOfDigits - 1;
        final Character lastChar = numberOfLotteryTicketsStr.charAt(lastIndex);
        final int lastDigit = Integer.parseInt(lastChar.toString());
        return lastDigit - numberOfDigits;
    }
}