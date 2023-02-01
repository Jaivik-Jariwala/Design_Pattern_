interface Animal {
    void speak();
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

interface AnimalFactory {
    Animal createAnimal();
}

class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

class Client {
    public static void main(String[] args) {
        AnimalFactory factory = null;
        String animalType = args[0];
        if (animalType.equalsIgnoreCase("dog")) {
            factory = new DogFactory();
        } else if (animalType.equalsIgnoreCase("cat")) {
            factory = new CatFactory();
        }
        Animal animal = factory.createAnimal();
        animal.speak();
    }
}
