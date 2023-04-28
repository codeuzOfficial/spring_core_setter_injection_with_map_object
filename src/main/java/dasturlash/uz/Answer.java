package dasturlash.uz;

public class Answer {
    private Integer id;
    private String text;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", text='" + text + '\'' + '}';
    }
}
