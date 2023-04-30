public class testIteraorPattern {
    public static void main(String[] args){
        ShapeStorage store = new ShapeStorage();
        store.addShape("triangle");
        store.addShape("square");
        store.addShape("n-gon");

        ShapeIterator iterator = new ShapeIterator(store.getShapes());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("remove");
        iterator = new ShapeIterator(store.getShapes());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
