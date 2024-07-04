import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
    private List<NodeGraph<T>> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Método para añadir un nodo
    public NodeGraph<T> addNode(T value) {
        NodeGraph<T> newNode = new NodeGraph<>(value);
        nodes.add(newNode);
        return newNode;
    }

    // Método para añadir una conexión
    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2) {
        node1.addFriends(node2);
        node2.addFriends(node1);
    }

    public void printGraph() {
        for (NodeGraph<T> node : nodes) {
            System.out.print("Vertex " + node.getUser().toString() + ":");

            for (NodeGraph<T> amigos : node.getFriends()) {
                System.out.print(" -> " + amigos.getUser());
            }
            System.out.println();
        }
    }

    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }

    // public List<T> Friends (NodeGraph <T> node){
    // return node.getFriends();

    // }
}
