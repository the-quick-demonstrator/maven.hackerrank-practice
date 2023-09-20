package com.github.curriculeon.adjacentremoval;

public class AdjacentRemovalSolution {
    public String gameWinner(String input) {
        return new AdjacentRemover(input).solve();
    }
}

