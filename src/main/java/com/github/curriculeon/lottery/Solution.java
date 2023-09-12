package com.github.curriculeon.lottery;

public class Solution {
    public int solution(int numberOfLotteryTickets) {
        return new LotteryTickets(numberOfLotteryTickets).getLargestNumberOfWinners();
    }
}
