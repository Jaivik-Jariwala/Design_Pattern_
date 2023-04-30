public class MediatorPatternDemo {
    public static void main(String[] args) {
        OrderMessageMediator mediator = new OrderMessageMediator();

        Order order1 = new Order(mediator, "1");
        Order order2 = new Order(mediator, "2");
        Order order3 = new Order(mediator, "3");

        mediator.addOrder(order1);
        mediator.addOrder(order2);
        mediator.addOrder(order3);

        order1.sendMessage("Hello from order 1!");
        order2.sendMessage("Hi there from order 2!");
    }
}
