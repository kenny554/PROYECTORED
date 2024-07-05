import java.util.ArrayList;
import java.util.List;

public class NodeGraph<T> {
    private T user;
    private List<NodeGraph<T>> friends;

    public NodeGraph(T user) {
        this.user = user;
        this.friends = new ArrayList<>();
    }

    public T getUser() {
        return user;
    }

    public List<NodeGraph<T>> getFriends() {
        return friends;
    }

    public void addFriend(NodeGraph<T> friend) {
        friends.add(friend);
    }
}
