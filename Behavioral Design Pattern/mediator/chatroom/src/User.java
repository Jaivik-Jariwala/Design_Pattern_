public class User {
    private String name;
    private Chatroom chatroom;

    public User(String name, Chatroom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatroom.addUser(this);
    }

    public void sendMessage(String message) {
        this.chatroom.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }

    public String getName() {
        return name;
    }
}
