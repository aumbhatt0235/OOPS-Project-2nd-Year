import java.io.IOException;

public class Question {
    private final int questionId;
    private String question;
    private String[] options = new String[4];
    private int correctOption;


    Question(int questionId) throws IOException {
        this.questionId = questionId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(String options1, String options2, String options3, String options4) {
        options[0] = options1;
        options[1] = options2;
        options[2] = options3;
        options[3] = options4;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    public void storeQuestion() throws IOException {
        if (!question.equals("")) {
            QuestionPaper.questions.add(this);
        }

    }

    public void stopStoringQuestion() throws IOException {
        //fileWriter.close();
    }

    public String toString() {
        return questionId + "/" + question + "/" + options[0]
                + "/" + options[1] + "/" + options[2] + "/" + options[3] + "/" + correctOption + "\n";
    }
}
