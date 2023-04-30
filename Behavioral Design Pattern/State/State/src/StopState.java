public class StopState implements State {
    public void doAction(Context context){
        System.out.println("Game ends");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }

}
