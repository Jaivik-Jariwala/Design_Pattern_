public class Main {
    public static void main(String[] args) {
        Car car = new BasicCar();
        car = new bugatti(car);
        car = new RollsRoyce(car);
        car.drive();

    }
}