import java.util.ArrayList;

public class Test {
    private int score;
    public ArrayList<Integer> correctAnswers = new ArrayList<>();

    public void calculateScore() {
        score = 0;
        for (Integer integer : correctAnswers) {
            score = score + integer;
        }

    }

    public int getScore() {
        return score;
    }
}
