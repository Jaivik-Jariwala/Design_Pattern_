
public class CompositePatternDemo {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("jade blue");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("jade Green");
    }

}