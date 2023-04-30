public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape blueCircle = new BlueShapeDecorator(new Circle());

        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of blue border");
        blueCircle.draw();

        System.out.println("\nRectangle of blue border");
        blueRectangle.draw();
    }
}