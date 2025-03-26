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
                    [3] MUDAR NÍVEL
                    [4] SAIR
                    """);

            int op = leitor.nextInt();
            leitor.nextLine();

            if (op == 0) {
                Jogador novoJogador = Jogador.addinfo(leitor);
                Jogadores.add(novoJogador);
                System.out.println("Jogador adicionado com sucesso!");

            } else if (op == 1) {
                if (Jogadores.isEmpty()) {
                    System.out.println("Nenhum jogador cadastrado.");
                } else {
                    System.out.println("Jogadores Cadastrados:");
                    for (Jogador jogador : Jogadores) {
                        jogador.exibirInfo();
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
                        jogador.atualizarPontuacao(leitor);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Jogador não encontrado.");
                }

            } else if (op == 3) {
                if (Jogadores.isEmpty()) {
                    System.out.println("Nenhum jogador cadastrado.");
                    continue;
                }

                System.out.println("Digite o nome do jogador para alterar o nível:");
                String nome = leitor.nextLine();
                boolean encontrado = false;

                for (Jogador jogador : Jogadores) {
                    if (jogador.nome.equalsIgnoreCase(nome)) {
                        jogador.atualizarNivel(leitor);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Jogador não encontrado.");
                }

            } else if (op == 4) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        leitor.close();
    }
}
