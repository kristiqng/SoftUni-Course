package ObjectsAndClassesExercise.Articles_02;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit (String content) {
        this.content = content;
    }
    public void change (String author) {
        this.author = author;
    }
    public void rename (String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor () {
        return this.author;
    }
    @Override //пренаписвате вграден метод
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
