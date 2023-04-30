import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);

        if(flyweight == null) {
            flyweight = new ConcreteFlyweight();
            flyweights.put(key, flyweight);
        }

        return flyweight;
    }
}