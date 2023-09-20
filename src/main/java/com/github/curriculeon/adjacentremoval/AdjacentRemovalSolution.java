package com.github.curriculeon.adjacentremoval;

public class AdjacentRemovalSolution {
    public static class AdjacentRemover {
        private String input;
        private boolean isWendysTurns;

        public AdjacentRemover(String input) {
            this.input = input;
            this.isWendysTurns = true;
        }

        public boolean canEitherMove() {
            boolean cmb = canMoveBob();
            boolean cmw = canMoveWendy();
            return cmb || cmw;
        }

        public boolean canMoveBob() {
            return input.contains("bbb");
        }

        public boolean canMoveWendy() {
            return input.contains("www");
        }

        public void play() {
            final StringBuilder sb = new StringBuilder(this.input);
            while (canEitherMove()) {
                String characterToEvaluate = "www";
                if (!isWendysTurns) {
                    characterToEvaluate = "bbb";
                }
                final int indexOfSubstring = sb.indexOf(characterToEvaluate);
                final int indexOfMiddleCharacter = indexOfSubstring + 1;
                sb.deleteCharAt(indexOfMiddleCharacter);
                this.input = sb.toString();
                isWendysTurns = !isWendysTurns;
            }
        }

        public String solve() {
            boolean bobCantMove = canMoveWendy() && !canMoveBob();
            boolean wendyCantMove = !canMoveWendy() && canMoveBob();

            if (bobCantMove) {
                return "wendy";
            }
            if (wendyCantMove) {
                return "bob";
            }

            play();
            if (isWendysTurns) {
                return "bob";
            } else {
                return "wendy";
            }

        }
    }
    public String gameWinner(String input) {
        return new AdjacentRemover(input).solve();
    }
}

