import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Graph<User> graph = new Graph<>();

        // Crear usuarios
        User user1 = new User("Alice", 30, Arrays.asList("Music", "Art"));
        User user2 = new User("Bob", 25, Arrays.asList("Music", "Sports"));
        User user3 = new User("Charlie", 35, Arrays.asList("Art", "Movies"));
        User user4 = new User("Dave", 40, Arrays.asList("Sports", "Travel"));
        User user5 = new User("Eve", 28, Arrays.asList("Music", "Movies"));

        // Crear nodos
        NodeGraph<User> node1 = new NodeGraph<>(user1);
        NodeGraph<User> node2 = new NodeGraph<>(user2);
        NodeGraph<User> node3 = new NodeGraph<>(user3);
        NodeGraph<User> node4 = new NodeGraph<>(user4);
        NodeGraph<User> node5 = new NodeGraph<>(user5);

        // Añadir nodos al grafo
        graph.addNode(user1);
        graph.addNode(user2);
        graph.addNode(user3);
        graph.addNode(user4);
        graph.addNode(user5);

        // Añadir conexiones
        graph.addConnection(node1, node2);
        graph.addConnection(node1, node3);
        graph.addConnection(node2, node4);
        graph.addConnection(node2, node3);
        graph.addConnection(node3, node5);
        graph.printGraph();

        RecomendationEngine engine = new RecomendationEngine();
        List<User> recomendations = engine.recommendFriends(node1, graph);
        System.out.println("Friend recommendations for " + user1.getName() + ":" + recomendations);
    }
}
