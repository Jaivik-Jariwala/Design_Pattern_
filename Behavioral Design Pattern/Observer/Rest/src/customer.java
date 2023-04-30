public class customer implements Observer {
    private String name;
    private restaurant res=new restaurant();
    public customer(String name) {
        this.name=name;
    }
    public void update() {
        System.out.println("hey"+name+"you are at restaurant:"+res.orderlist);
    }
    public void gotorestaurant(restaurant rest)
    {
        res=rest;
    }
}