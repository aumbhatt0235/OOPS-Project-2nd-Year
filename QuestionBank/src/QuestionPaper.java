import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionPaper {

    public static final ArrayList<Question> questions = new ArrayList<>();


    public static void storeQuestions() throws IOException {
        FileWriter fileWriter = new FileWriter("QuestionBank.txt", true);
        for (Question question : questions) {
            fileWriter.append(question.toString());
        }
        fileWriter.close();
    }
}
