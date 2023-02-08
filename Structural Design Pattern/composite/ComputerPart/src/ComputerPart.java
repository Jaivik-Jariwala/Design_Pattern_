import java.util.ArrayList;
import java.util.List;

abstract class ComputerPart {
    protected String name;
    public ComputerPart(String name) {
        this.name = name;
    }
    abstract public void add(ComputerPart part);
    abstract public void remove(ComputerPart part);
    abstract public void display();
}



class Computer extends ComputerPart {
    private List<ComputerPart> parts = new ArrayList<>();
    public Computer(String name) {
        super(name);
    }
    @Override
    public void add(ComputerPart part) {
        parts.add(part);
    }
    @Override
    public void remove(ComputerPart part) {
        parts.remove(part);
    }
    @Override
    public void display() {
        System.out.println("Computer: " + name);
        for (ComputerPart part : parts) {
            part.display();
        }
    }
}
