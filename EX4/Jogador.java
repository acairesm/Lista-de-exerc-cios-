import java.util.Scanner;

public class Jogador {

    String nome;
    int pontuacao;
    int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public static Jogador addinfo(Scanner leitor) {
        System.out.println("Qual o nome do jogador?");
        String nome = leitor.nextLine();

        System.out.println("Qual a pontuação inicial?");
        int pontuacao = leitor.nextInt();

        System.out.println("Qual o nível inicial?");
        int nivel = leitor.nextInt();
        leitor.nextLine();

        return new Jogador(nome, pontuacao, nivel);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Pontuação: " + pontuacao + " | Nível: " + nivel);
    }

    public void atualizarPontuacao(Scanner leitor) {
        System.out.println("Digite a nova pontuação:");
        this.pontuacao = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Pontuação alterada!");
    }

    public void atualizarNivel(Scanner leitor) {
        System.out.println("Digite o novo nível:");
        this.nivel = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Nível alterado!");
    }
}
