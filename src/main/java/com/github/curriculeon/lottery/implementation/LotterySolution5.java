package com.github.curriculeon.lottery.implementation;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LotterySolution5 implements LotteryTicketSolutionInterface {



    @Override
    public int getSizeOfListOfLargestNumberOfWinners(Integer numberOfLotteryTickets) {
        return new Solution(numberOfLotteryTickets).getSizeOfListOfLargestNumberOfWinners();
    }
}
