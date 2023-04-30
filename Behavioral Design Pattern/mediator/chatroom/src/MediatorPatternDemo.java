public class MediatorPatternDemo {
    public static void main(String[] args) {
        Chatroom chatroom = new ChatroomImpl();

        User john = new User("John", chatroom);
        User jane = new User("Jane", chatroom);
        User bob = new User("Bob", chatroom);

        john.sendMessage("Hi everyone!");
        jane.sendMessage("Hello John!");
        bob.sendMessage("Welcome to the chatroom!");
    }
}
