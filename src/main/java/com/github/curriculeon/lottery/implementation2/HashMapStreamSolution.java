package com.github.curriculeon.lottery.implementation2;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

public class HashMapStreamSolution implements LotteryTicketSolutionInterface {
    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        final CouponEvaluator coupons =new CouponEvaluator(numberOfLotteryTickets);
//        System.out.println("getLotteryTicketList = " + coupons.getLotteryTicketStream());
        System.out.println("getSumsAndRespectiveLotteryNumbers = " + coupons.getSumsAndRespectiveLotteryNumbers());
        System.out.println("getLargestNumberOfWinner = " + coupons.getLargestNumberOfWinners());
        System.out.println("getListOfLargestNumberOfWinners = " + coupons.getListOfLargestNumberOfWinners());
        return coupons.getListOfLargestNumberOfWinners().size();
    }
}
