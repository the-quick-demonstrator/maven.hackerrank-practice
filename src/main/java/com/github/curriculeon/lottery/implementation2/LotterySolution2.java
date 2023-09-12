package com.github.curriculeon.lottery.implementation2;

import com.github.curriculeon.lottery.SolutionInterface;

public class LotterySolution2 implements SolutionInterface {
    @Override
    public int solution(int numberOfLotteryTickets) {
        return new Coupons(numberOfLotteryTickets).getLargestNumberOfWinners();
    }
}
