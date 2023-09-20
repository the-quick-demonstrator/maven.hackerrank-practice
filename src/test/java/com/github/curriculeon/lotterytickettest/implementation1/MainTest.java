package com.github.curriculeon.lotterytickettest.implementation1;

import com.github.curriculeon.lotterytickettest.LotteryTicketTestInterface;
import org.junit.Test;

public interface MainTest extends LotteryTicketTestInterface {
    @Test
    default void patternTest() {
        // two 9s expected in the 10s
        test(10, 1);
        test(11, 2);
        test(12, 3);
        test(13, 4);
        test(14, 5);
        test(15, 6);
        test(17, 8);
        test(18, 9); // anomaly
        test(19, 9); // anomaly

        // three 8s expected in the 20s
        test(20, 1);
        test(21, 2);
        test(22, 3);
        test(23, 4);
        test(24, 5);
        test(25, 6);
        test(26, 7);
        test(27, 8); // anomaly
        test(28, 8); // anomaly
        test(29, 8); // anomaly

        // four 7s expected in the 30s
        test(30, 1);
        test(31, 2);
        test(32, 3);
        test(33, 4);
        test(34, 5);
        test(35, 6);
        test(36, 7); // anomaly
        test(37, 7); // anomaly
        test(38, 7); // anomaly
        test(39, 7); // anomaly

        // five 6s expected in the 40s
        test(40, 1);
        test(45, 6); // anomaly
        test(46, 6); // anomaly
        test(47, 6); // anomaly
        test(48, 6); // anomaly
        test(49, 6); // anomaly

        // six 5s expected in the 50s
        test(50, 1);
        test(53, 4);
        test(54, 5); // anomaly start point
        test(59, 5); // anomaly stop point

        // seven 4s expected in the 60s
        test(60, 1);
        test(62, 3);
        test(63, 4); // anomaly start point
        test(69, 4); // anomaly stop point

        // eight 3s expected in the 70s
        test(70, 1);
        test(71, 2);
        test(72, 3); // anomaly start point
        test(79, 3); // anomaly stop point

        // nine 2s expected in the 80s
        test(80, 1);
        test(81, 2); // anomaly start point
        test(89, 2); // anomaly stop point

        // ten 1s expected in the 90s
        test(90, 1);
        test(99, 1);
    }

}
