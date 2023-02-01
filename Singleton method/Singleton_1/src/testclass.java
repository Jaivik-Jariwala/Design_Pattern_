package St;

public class testclass {
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();
        s1.setI(5);
        s2.setI(10);
        System.out.println(s1.getI());
        s2.i = s1.i + s2.i;
        System.out.println(s2.getI());
        print("S1",s1);
        print("S2",s2);
    }
    static void print(String name , singleton obj){
        System.out.println(String.format("Object : %s , Hashcode : %d",name,obj.hashCode()));
    }
}
