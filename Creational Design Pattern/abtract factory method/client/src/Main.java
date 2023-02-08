interface Button {
    void paint();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

class OSXButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created OSXButton.");
    }
}

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}

class Application {
    public void paint(GUIFactory factory) {
        Button button = factory.createButton();
        button.paint();
    }
}

class Client {
    public static void main(String[] args) {
        Application app = new Application();
        GUIFactory factory = null;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new OSXFactory();
        }
        app.paint(factory);
    }
}
