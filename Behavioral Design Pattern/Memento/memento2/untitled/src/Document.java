public class Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Document content updated to: " + content);
    }

    public Memento createMemento() {
        System.out.println("Creating memento...");
        return new Memento(content);
    }

    public void restoreFromMemento(Memento memento) {
        content = memento.getContent();
        System.out.println("Restoring document content from memento: " + content);
    }

    public String getContent() {
        return content;
    }
}