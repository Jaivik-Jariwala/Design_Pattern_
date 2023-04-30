public interface Chatroom {
    void sendMessage(User user, String message);
    void addUser(User user);
}
