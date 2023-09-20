package com.github.curriculeon;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation1.LotterySolution1;
import com.github.curriculeon.lottery.implementation3.LotterySolution3;
import org.junit.Assert;
import org.junit.Test;

import java.beans.Transient;

public class LotteryTicketTest3 {
    // given
    private void test(int numberOfLotteryTickets, int expected) {
        System.out.println(new String(new char[25]).replaceAll(String.valueOf(Character.MIN_VALUE), "-"));
        System.out.println(numberOfLotteryTickets);
        final LotteryTicketSolutionInterface implementation = new LotterySolution3();

        // when
        final int actual = implementation.getSizeOfListOfLargestNumberOfWinners(numberOfLotteryTickets);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test12() {
        test(12, 3);
    }

    @Test
    public void test14() {
        test(14, 5);
    }
    @Test
    public void test19() {
        test(19, 9);
    }

    @Test
    public void testCustom() {
//        // nine 1s expected in the 0s
        for (int i = 1; i < 9; i++) {
            test(i, 1);
        }
//
//        // two 9s expected in the 10s
        test(10, 1);
        test(11, 2);
        test(12, 3);
        test(13, 4);
        test(14, 5);
        test(15, 6);
        test(17, 8);
        test(18, 9); // mystery
        test(19, 9); // mystery
        test(54, 5);
        test(20, 1);
        test(21, 2);
        test(22, 3);
        test(24, 5);
        test(25, 6);
        test(26, 7);
        test(27, 8);
    }

    @Test
    public void testMysteryNumbers() {

        // two 9s expected in the 10s

        test(18, 9); // mystery
        test(19, 9); // mystery

        // three 8s expected in the 20s
        test(25, 6);
        test(26, 7);
        test(27, 8); // mystery
        test(28, 8); // mystery
        test(29, 8); // mystery

        // four 7s expected in the 30s
        test(32, 3); // mystery
        test(33, 4); // mystery
        test(34, 5); // mystery
        test(35, 6); // mystery
        test(36, 7); // mystery
        test(37, 7); // mystery
        test(38, 7); // mystery
        test(39, 7); // mystery

        // five 6s expected in the 40s
        test(47, 6);
        test(48, 6);
        test(49, 6);

        // six 5s expected in the 50s
        test(54, 5);
        test(55, 5);
        test(57, 5);
        test(58, 5);

        // seven 4s expected in the 60s
        test(68, 4);

        // eight 3s expected in the 70s
        test(78, 3);

        // nine 2s expected in the 80s
        test(88, 2);

        // ten 1s expected in the 90s
        test(98, 1);

        test(100, 1);
    }


    @Test
    public void patternDemo() {
        // nine 1s expected in the 0s
        for (int i = 1; i < 9; i++) {
            //test(i, 1);
        }


        // two 9s expected in the 10s
        test(10, 1);
        test(11, 2);
        test(12, 3);
        test(13, 4);
        test(14, 5);
        test(15, 6);
        test(16, 7);
        test(17, 8);
        test(18, 9); // mystery
        test(19, 9); // mystery

        // three 8s expected in the 20s
        test(20, 1);
        test(26, 7);
        test(27, 8); // mystery
        test(28, 8); // mystery
        test(29, 8); // mystery

        // four 7s expected in the 30s
        test(30, 1);
        test(35, 6);
        test(36, 7); // mystery
        test(37, 7); // mystery
        test(38, 7); // mystery
        test(39, 7); // mystery

        // five 6s expected in the 40s
        test(40, 1);
        test(47, 6);
        test(48, 6);
        test(49, 6);

        // six 5s expected in the 50s
        test(50, 1);
        test(53, 4);
        test(54, 5);
        test(55, 5);
        test(57, 5);
        test(58, 5);

        // seven 4s expected in the 60s
        test(68, 4);

        // eight 3s expected in the 70s
        test(78, 3);

        // nine 2s expected in the 80s
        test(88, 2);

        // ten 1s expected in the 90s
        test(98, 1);

        test(100, 1);
        test(108, 1);
        test(118, 1);
        test(1222, 1);


    }

    @Test
    public void test29() {
        test(29, 8);
    }

    @Test
    public void test38() {
        test(38, 7);
    }

    @Test
    public void test39() {
        test(39, 7);
    }

    @Test
    public void test47() {
        test(47, 6);
    }

    @Test
    public void test48() {
        test(48, 6);
    }


    @Test
    public void test92() {
        test(92, 1);
    }

    @Test
    public void test93() {
        test(93, 1);
    }

    @Test
    public void test94() {
        test(94, 1);
    }

    @Test
    public void test100() {
        test(100, 1);
    }

    @Test
    public void test101() {
        test(101, 1);
    }

    @Test
    public void test102() {
        test(102, 1);
    }
}