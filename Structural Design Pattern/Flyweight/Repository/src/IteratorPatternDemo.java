public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namerepo = new NameRepository();

        for(Iterator iter = namerepo.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}