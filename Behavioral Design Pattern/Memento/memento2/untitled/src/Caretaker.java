import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementos = new Stack<>();

    public void saveMemento(Memento memento) {
        System.out.println("Saving memento...");
        mementos.push(memento);
    }

    public Memento undo() {
        if (!mementos.isEmpty()) {
            System.out.println("Undoing...");
            return mementos.pop();
        } else {
            System.out.println("No more mementos to undo.");
            return null;
        }
    }
}