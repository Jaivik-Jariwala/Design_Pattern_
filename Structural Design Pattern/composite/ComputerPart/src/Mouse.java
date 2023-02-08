class Mouse extends ComputerPart {
    public Mouse(String name) {
        super(name);
    }
    @Override
    public void add(ComputerPart part) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void remove(ComputerPart part) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void display() {
        System.out.println("Mouse: " + name);
    }
}