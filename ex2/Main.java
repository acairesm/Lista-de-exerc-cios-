import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Biblioteca> livros = new ArrayList<>();

        while (true) {
            System.out.println("BIBLIOTECA");
            System.out.println("----------------------------");
            System.out.println("""
                    [0] EXIBIR LIVROS
                    [1] ADICIONAR LIVRO
                    [2] SAIR
                    """);

            int opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 0) {
                System.out.println("LIVROS CADASTRADOS:");
                for (Biblioteca livro : livros) {
                    System.out.println(livro);
                }
            } else if (opcao == 1) {
                System.out.println("----------------------------");
                System.out.println("TÍTULO:");
                String titulo = leitor.nextLine();

                System.out.println("AUTOR:");
                String autor = leitor.nextLine();

                System.out.println("ANO:");
                int ano = leitor.nextInt();
                leitor.nextLine();

                Biblioteca infolivro = new Biblioteca(titulo, autor, ano);
                livros.add(infolivro);
                System.out.println("Livro adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        leitor.close();
    }
}