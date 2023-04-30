public class mobileContext {
    private MobileAlertState currentState;
    public mobileContext() {
        currentState= new Ringing();
    }
    public void setState(MobileAlertState state) {
        currentState=state;
    }
    public void Alert() {
        currentState.Alert();
    }
}