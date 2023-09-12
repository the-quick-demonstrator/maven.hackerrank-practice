package com.github.curriculeon.lottery.implementation2;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class LotterySolution2 implements LotteryTicketSolutionInterface {
    @Override
    public int solution(Integer numberOfLotteryTickets) {
        return new Coupons(numberOfLotteryTickets).getLargestNumberOfWinners();
    }
}
