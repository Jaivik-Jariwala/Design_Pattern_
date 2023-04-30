public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println(" first state : 172");
        subject.setState(172);
        System.out.println("second state : 121");
        subject.setState(121);
    }
}