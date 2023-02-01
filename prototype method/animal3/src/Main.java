interface Animal extends Cloneable {
    Animal makeCopy();
}

class Sheep implements Animal {
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Animal makeCopy() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }
}
