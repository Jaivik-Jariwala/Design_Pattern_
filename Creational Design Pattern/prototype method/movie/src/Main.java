interface PrototypeCapable extends Cloneable {
    PrototypeCapable clone();
}

class Movie implements PrototypeCapable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCapable clone() {
        Movie movie = null;
        try {
            movie = (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return movie;
    }
}
