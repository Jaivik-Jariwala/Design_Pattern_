public class StartState implements State {
    public void doAction(Context context){
        System.out.println("Game Begins");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
