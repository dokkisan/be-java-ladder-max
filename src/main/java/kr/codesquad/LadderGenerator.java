package kr.codesquad;

import java.util.Random;

public class LadderGenerator {
    private int maxHeight;
    int column;
    String[][] ladder;

    public LadderGenerator(int joinMembers, int maxHeight) {
        column = joinMembers + (joinMembers - 1);
        ladder = new String[this.maxHeight = maxHeight][column]; // maxHeight 초기화를 먼저 해야하는지
    }

    public String[][] generateLadder() {
        generateLadderArray();
        generateRandomLine();
        generateBorderLine();
        return ladder;
    }

    // 이중 for문이 반복되고 있는데 개선 방법 고민해보기
    private void generateLadderArray() {
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = " ";
            }
        }
    }

    private void generateRandomLine() {
        Random random = new Random();
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (j % 2 != 0 && random.nextBoolean()) {
                    ladder[i][j] = "-";
                }
            }
        }
    }

    private void generateBorderLine() {
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (isaBoolean(j)) {
                    ladder[i][j] = "|";
                }
            }
        }
    }

    private static boolean isaBoolean(int j) {
        return j % 2 == 0;
    }
}
