package com.github.curriculeon.adjacentremoval;

public class AdjacentRemover {
    private final String input;
    private boolean isWendysTurns;

    public AdjacentRemover(String input) {
        this.input = input;
        this.isWendysTurns = true;
    }

    public boolean canMoveBoth() {
        return canMoveBob() && canMoveWendy();
    }

    public boolean canMoveBob() {
        return input.contains("bbb");
    }

    public boolean canMoveWendy() {
        return input.contains("www");
    }

    public void play() {
        final StringBuilder sb = new StringBuilder(this.input);
        while (true) {
            String characterToEvaluate = "www";
            if(!canMoveWendy()) {
                break;
            }
            if (!isWendysTurns) {
                characterToEvaluate = "bbb";
                if(!canMoveBob()) {
                    break;
                }
            }
            final int indexOfSubstring = sb.indexOf(characterToEvaluate);
            final int indexOfMiddleCharacter = indexOfSubstring + 1;
            sb.deleteCharAt(indexOfMiddleCharacter);
            isWendysTurns = !isWendysTurns;
        }
    }

    public String solve() {
        if (canMoveWendy() && !canMoveBob()) {
            return "wendy";
        }
        if (!canMoveWendy() && canMoveBob()) {
            return "bob";
        }


        if (canMoveBoth()) {
            if (canMoveWendy() && !canMoveBob()) {
                return "wendy";
            } else {
                play();
                if(isWendysTurns) {
                    return "bob";
                } else {
                    return "wendy";
                }
            }
        } else {
            return "bob";
        }
    }
}
