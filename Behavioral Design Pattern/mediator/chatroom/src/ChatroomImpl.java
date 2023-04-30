import java.util.ArrayList;
import java.util.List;

public class ChatroomImpl implements Chatroom {
    private List<User> users;

    public ChatroomImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User u : this.users) {
            if (!u.getName().equals(user.getName())) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
