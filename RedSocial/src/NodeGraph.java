import java.util.LinkedList;
import java.util.List;

public class NodeGraph<T> {
    private T user;
    private List<NodeGraph<T>> friends;

    public NodeGraph(T user) {
        this.user = user;
        this.friends = new LinkedList<>();
    }

    public T getUser() {
        return user;
    }

    public List<NodeGraph<T>> getFriends() {
        return friends;
    }

    public void addFriends(NodeGraph<T> friendss) {
        friends.add(friendss);
    }
}
