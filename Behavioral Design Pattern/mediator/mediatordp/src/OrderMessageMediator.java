import java.util.ArrayList;
import java.util.List;

public class OrderMessageMediator {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void sendMessage(Order order, String message) {
        for (Order o : orders) {
            if (o != order) {
                o.receiveMessage(message);
            }
        }
    }
}