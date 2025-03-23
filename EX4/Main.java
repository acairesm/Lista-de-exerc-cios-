import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Jogador> Jogadores = new ArrayList<>();

        System.out.println("JOGADORES");
        System.out.println("---------------------");

        while (true) {
            System.out.println("""
                    [0] ADICIONAR JOGADOR
                    [1] EXIBIR JOGADORES
                    [2] MUDAR PONTUAÇÃO
                    [3] SAIR
                    """);

            int op = leitor.nextInt();
            leitor.nextLine();

            if (op == 0) {

                System.out.println("Qual o nome do jogador?");
                String nome = leitor.nextLine();

                System.out.println("Qual a pontuação inicial?");
                int pontuacao = leitor.nextInt();

                System.out.println("Qual o nível inicial?");
                int nivel = leitor.nextInt();
                leitor.nextLine();

                Jogadores.add(new Jogador(nome, pontuacao, nivel));
                System.out.println("Jogador adicionado com sucesso!");

            } else if (op == 1) {

                if (Jogadores.isEmpty()) {
                    System.out.println("Nenhum jogador cadastrado.");
                } else {
                    System.out.println("Jogadores Cadastrados:");
                    for (Jogador jogador : Jogadores) {
                        System.out.println("Nome: " + jogador.nome + " | Pontuação: " + jogador.pontuacao + " | Nível: " + jogador.nivel);
                    }
                }

            } else if (op == 2) {
   
                if (Jogadores.isEmpty()) {
                    System.out.println("Nenhum jogador cadastrado.");
                    continue;
                }

                System.out.println("Digite o nome do jogador para alterar a pontuação:");
                String nome = leitor.nextLine();
                boolean encontrado = false;

                for (Jogador jogador : Jogadores) {
                    if (jogador.nome.equalsIgnoreCase(nome)) {
                        System.out.println("Digite a nova pontuação:");
                        jogador.pontuacao = leitor.nextInt();
                        leitor.nextLine();
                        System.out.println("Pontuação alterada!");


                        System.out.println("Digite o novo nivel:");
                        jogador.nivel = leitor.nextInt();
                        leitor.nextLine();
                        System.out.println("Nivel alterado!");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Jogador não encontrado.");
                }

            } else if (op == 3) {
                // Sair do programa
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        leitor.close();
    }
}

