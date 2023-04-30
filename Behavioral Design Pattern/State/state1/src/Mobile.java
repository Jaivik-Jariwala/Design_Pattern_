public class Mobile {
    public static void main(String args[]) {
        mobileContext mc = new mobileContext();
        mc.Alert();
        mc.setState(new Silent());
        mc.Alert();
        System.out.println("---Set to Ringing Again--");
        mc.setState(new Ringing());
        mc.Alert();
    }
}