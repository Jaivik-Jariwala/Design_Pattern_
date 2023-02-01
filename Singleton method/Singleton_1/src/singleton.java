package St;

public class singleton {
    private static singleton soleInstance = new singleton();
    public int i;
    private singleton(){
        System.out.println("Created...");
    }
    public static singleton getInstance(){
        return soleInstance;
    }
    public int getI(){
        return i;
    }
    public static void setSoleInstance(singleton soleInstance){
        singleton.soleInstance = soleInstance;
    }
    public void setI(int i){
        this.i = i;
    }

}
