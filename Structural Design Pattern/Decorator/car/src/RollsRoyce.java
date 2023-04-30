public class RollsRoyce extends CarDecorator{
    public RollsRoyce(Car car){
        super(car);
    }
    public void drive(){
        car.drive();
        System.out.println("driving rollsroyce");
    }
}
