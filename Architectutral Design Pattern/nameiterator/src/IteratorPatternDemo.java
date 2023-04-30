public class IteratorPatternDemo {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepository();
        for (Iterator iter = orderRepository.getIterator(); iter.hasNext();) {
            String order = (String) iter.next();
            System.out.println("order: " + order);
        }
    }
}