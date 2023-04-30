public class documentmain {
    public static void main(String[] args) {
        Document document = new Document();
        Caretaker caretaker = new Caretaker();

        document.setContent("This is the first version of the document.");
        caretaker.saveMemento(document.createMemento());

        document.setContent("This is the second version of the document.");
        caretaker.saveMemento(document.createMemento());

        document.setContent("This is the third version of the document.");
        caretaker.saveMemento(document.createMemento());

        document.restoreFromMemento(caretaker.undo());
        System.out.println("Current document content: " + document.getContent());

        document.restoreFromMemento(caretaker.undo());
        System.out.println("Current document content: " + document.getContent());

        document.restoreFromMemento(caretaker.undo());
        System.out.println("Current document content: " + document.getContent());

        document.restoreFromMemento(caretaker.undo());
        System.out.println("Current document content: " + document.getContent());
    }
}
