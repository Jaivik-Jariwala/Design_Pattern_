import java.util.ArrayList;
import java.util.List;
public class restaurant implements Subject {
    private List<customer> cus=new ArrayList<customer>();
    public String orderlist;
    public void order(customer o1) {
        cus.add(o1);
    }
    public void cancelorder(Observer o1) {
        cus.remove(o1);
    }
    public void notifycustomer()
    {
        for(Observer o1:cus)
        {
            o1.update();
        }
    }
    public void upload(String orderlist)
    {
        this.orderlist=orderlist;
        notifycustomer();
    }
}