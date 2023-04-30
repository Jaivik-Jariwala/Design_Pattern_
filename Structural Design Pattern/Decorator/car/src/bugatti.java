public class bugatti extends CarDecorator{
    public bugatti(Car car){
        super(car);
    }
    public void drive(){
        car.drive();
        System.out.println("driving bugatti");
    }
}
