public class ShapeStorage {

    private Shape[]shapes = new Shape[3];
    private int index;

    public void addShape(String name){
        int i = index++;
        shapes[i]= new Shape(i ,name);
    }

    public Shape[] getShapes(){
        return shapes;
    }
}
