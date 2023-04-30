public class OrderRepository implements Container {
    public String orders[] = {"pizza", "pasta", "ice cream", "burger"};

    public Iterator getIterator() {
        return new OrderIterator();
    }

    private class OrderIterator implements Iterator {
        int index;

        public boolean hasNext() {
            return index < orders.length;
        }

        public Object next() {
            if (this.hasNext()) {
                return orders[index++];
            }
            return null;
        }
    }
}