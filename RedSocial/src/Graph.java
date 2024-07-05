import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
    private List<NodeGraph<T>> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Método para añadir un nodo al grafo
    public NodeGraph<T> addNode(T value) {
        NodeGraph<T> newNode = new NodeGraph<>(value);
        nodes.add(newNode);
        return newNode;
    }

    // Método para añadir una conexión entre dos nodos
    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2) {
        node1.addFriend(node2);
        node2.addFriend(node1); // Agregar la conexión en ambas direcciones (grafo no dirigido)
    }

    // Método para imprimir el grafo
    public void printGraph() {
        for (NodeGraph<T> node : nodes) {
            System.out.print("Vertex " + node.getUser().toString() + ":");

            for (NodeGraph<T> friend : node.getFriends()) {
                System.out.print(" -> " + friend.getUser().toString());
            }
            System.out.println();
        }
    }

    // Método para obtener la lista de nodos del grafo
    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }
}
