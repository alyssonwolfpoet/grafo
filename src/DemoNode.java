import java.util.ArrayList;
import java.util.List;

// Classe Nó para representar cada nó da árvore
class Node {
    int value; // O valor do nó
    List<Node> children; // A lista de filhos do nó

    // Construtor da classe Nó
    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>(); // Inicializa a lista de filhos como vazia
    }

    // Método para adicionar um filho ao nó
    public void addChild(Node child) {
        this.children.add(child);
    }
}

// Classe principal que contém o método principal
public class DemoNode {

    // Método para encontrar o número de folhas em uma árvore
    public static int countLeaves(Node root) {
        // Se a raiz for nula, retorna 0
        if (root == null) {
            return 0;
        }

        // Se a raiz não tiver filhos, retorna 1
        if (root.children.isEmpty()) {
            return 1;
        }

        // Inicializa o contador de folhas como 0
        int leafCount = 0;

        // Para cada filho da raiz, chama a função recursivamente e adiciona ao contador
        for (Node child : root.children) {
            leafCount += countLeaves(child);
        }

        // Retorna o contador de folhas
        return leafCount;
    }

    // Método principal que cria a árvore e chama o método countLeaves
    public static void main(String[] args) {
        // Cria os nós da árvore com os valores dados na imagem
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        // Adiciona os filhos aos nós de acordo com a imagem
        node1.addChild(node2);
        node2.addChild(node3);
        node2.addChild(node4);
        node2.addChild(node5);
        node1.addChild(node6);
        node6.addChild(node7);
        node6.addChild(node8);

        // Chama o método countLeaves passando o nó 1 como raiz da árvore
        int result = countLeaves(node1);

        // Imprime o resultado na tela
        System.out.println("O número de folhas na árvore é " + result);
    }
}