public interface Subject {
    void order(customer o1);
    void cancelorder(Observer o1);
    void notifycustomer();
    void upload(String orderlist);
}