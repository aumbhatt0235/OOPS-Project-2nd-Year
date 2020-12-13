import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    private int score;
    public ArrayList<Integer> correctAnswers = new ArrayList<>();

    public void calculateScore() throws IOException {
        score = 0;
        for (Integer integer : correctAnswers) {
            score = score + integer;
        }
        FileWriter fileWriter = new FileWriter("Scores.txt", true);
        File file = new File("PresentUser.txt");
        Scanner sc = new Scanner(file);
        String x = sc.nextLine();
        String[] y = x.split(" ");
        String id = y[1];
        fileWriter.append(id).append(" ").append(String.valueOf(score)).append("\n");
        fileWriter.close();
    }

    public int getScore() {
        return score;
    }
}
