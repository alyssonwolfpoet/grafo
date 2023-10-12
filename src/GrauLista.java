import java.util.ArrayList;
import java.util.Scanner;

public class GrauLista {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lendo o número de nós do grafo
        System.out.println("Digite o número de nós do grafo:");
        int n = sc.nextInt();

        // Criando a lista de adjacências com os vizinhos de cada nó
        ArrayList<ArrayList<Integer>> lista = new ArrayList<>();

        // Inicializando cada lista interna como vazia
        for (int i = 0; i < n; i++) {
            lista.add(new ArrayList<>());
        }

        // Lendo as arestas do grafo
        System.out.println("Digite as arestas do grafo no formato \"origem destino\":");
        System.out.println("Digite -1 para encerrar a entrada:");
        while (true) {
            // Lendo a origem e o destino da aresta
            int origem = sc.nextInt();
            // Se for -1, encerra o loop
            if (origem == -1) {
                break;
            }
            int destino = sc.nextInt();
            // Adicionando o destino à lista de vizinhos da origem
            lista.get(origem).add(destino);
            // Se o grafo for não-direcionado, adiciona também a origem à lista de vizinhos do destino
            //lista.get(destino).add(origem);
        }

        // Contando e imprimindo o grau de cada nó
        System.out.println("O grau de cada nó do grafo é:");
        for (int i = 0; i < n; i++) {
            // Obtendo o tamanho da lista interna correspondente ao nó i
            int grau = lista.get(i).size();
            // Imprimindo o grau do nó i
            System.out.println("Nó " + i + ": " + grau);
        }
    }
}
