package kr.codesquad;

public class OutputView {
    private String PARTICIPANTS_PROMPT = "참여할 사람은 몇 명인가요?";
    private String MAX_HEIGHT_PROMPT = "최대 사다리 높이는 몇 개인가요?";

    public void printParticipantsPrompt() {
        System.out.println(PARTICIPANTS_PROMPT);
    }

    public void printMaxHeightPrompt() {
        System.out.println(MAX_HEIGHT_PROMPT);
    }

    public void printLadderState(String[][] ladder) {
        extracted(ladder);
    }

    private void extracted(String[][] ladder) {
        for (int i = 0; i < ladder.length * ladder[0].length; i++) {
            int row = i / ladder[0].length;
            int column = i % ladder[0].length;
            System.out.print(ladder[row][column]);

            if (column == ladder[0].length - 1) {
                System.out.println();
            }
        }
    }
}