public class dine {
    public static void main(String args[]) {
        restaurant Dine = new restaurant();
        customer c1=new customer("lekha");
        customer c2=new customer("wolf");
        customer c3=new customer("bhatt");
        customer c4=new customer("grey");
        customer c5=new customer("nomad");
        Dine.order(c1);
        Dine.order(c2);
        Dine.order(c3);
        Dine.order(c4);
        Dine.order(c5);
        c1.gotorestaurant(Dine);
        c2.gotorestaurant(Dine);
        c3.gotorestaurant(Dine);
        c4.gotorestaurant(Dine);
        c5.gotorestaurant(Dine);
        Dine.upload("mcd");
        Dine.cancelorder(c2);
        Dine.cancelorder(c3);
        Dine.upload("project ");
    }
}