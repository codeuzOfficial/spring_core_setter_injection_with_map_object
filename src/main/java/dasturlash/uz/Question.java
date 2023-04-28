package dasturlash.uz;

import java.util.Map;

public class Question {
    private Integer id;
    private String text;
    private Map<String, Answer> answers;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(Map<String, Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", text='" + text + '\'' + ", answers=" + answers + '}';
    }
}
