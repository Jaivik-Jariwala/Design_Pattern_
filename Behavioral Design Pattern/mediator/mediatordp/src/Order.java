public class Order {
    private String order;
    private OrderMessageMediator mediator;

    public Order(OrderMessageMediator mediator, String order) {
        this.mediator = mediator;
        this.order = order;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println("Order " + order + " received message: " + message);
    }
}