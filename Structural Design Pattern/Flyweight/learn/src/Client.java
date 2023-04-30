public class Client {

    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("key");
        flyweight.operation();
    }
}