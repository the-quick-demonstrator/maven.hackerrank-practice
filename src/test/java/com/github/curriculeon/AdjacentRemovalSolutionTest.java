package com.github.curriculeon;

import com.github.curriculeon.adjacentremoval.AdjacentRemovalSolution;
import org.junit.Assert;
import org.junit.Test;

public class AdjacentRemovalSolutionTest {

    @Test
    public void test0() {
        //given
        final String input = "www";
        final String expected = "wendy";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test1() {
        //given
        final String input = "bbb";
        final String expected = "bob";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test3() {
        //given
        final String input = "bbbwww";
        final String expected = "wendy";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test4() {
        //given
        final String input = "wb";
        final String expected = "bob";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test10() {
        //given
        final String input = "wwwbbbbwww";
        final String expected = "bob";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test20() {
        //given
        final String input = "wwwbbbwww";
        final String expected = "wendy";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test30() {
        //given
        final String input = "wwbbbwww";
        final String expected = "bob";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test40() {
        //given
        final String input = "wwbbwww";
        final String expected = "wendy";
        final AdjacentRemovalSolution solution = new AdjacentRemovalSolution();

        // when
        final String actual = solution.gameWinner(input);


        // then
        Assert.assertEquals(expected, actual);
    }


}
