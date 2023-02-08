public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("KEYCHRON");
        Mouse mouse = new Mouse("Razer");
        Computer computer = new Computer("Asus TUF GAMING");
        computer.add(keyboard);
        computer.add(mouse);
        computer.display();
    }
}
