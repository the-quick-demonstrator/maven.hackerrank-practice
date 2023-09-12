package com.github.curriculeon.lottery.implementation3;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution3 implements LotteryTicketSolutionInterface {

    @Override
    public int solution(Integer numberOfLotteryTickets) {
        final String numberOfLotteryTicketsStr = numberOfLotteryTickets.toString();
        final int numberOfDigits = numberOfLotteryTicketsStr.length();
        final int lastIndex = numberOfDigits - 1;
        final Character lastChar = numberOfLotteryTicketsStr.charAt(lastIndex);
        final int lastDigit = Integer.parseInt(lastChar.toString());
        return lastDigit - numberOfDigits;
    }
}
