import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        conta minhaConta = new conta(123456, "João Silva", 1000.0f);
        System.out.println("Saldo atual em conta: R$ " + minhaConta.getSaldo());


        System.out.println("Digite o valor de depósito: R$ ");
        float deposito = scanner.nextFloat();
        minhaConta.depositar(deposito);
        System.out.println("Saldo após depósito: R$ " + minhaConta.getSaldo());


        System.out.println("Digite o valor para saque: R$ ");
        float saque = scanner.nextInt();
        minhaConta.sacar(saque);
        System.out.println("Saldo após saque: R$ " + minhaConta.getSaldo());

        scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite o nome do titular: ");
        String nome = scanner.nextLine();
        minhaConta.nome(nome);
        System.out.println("Bem-vindo: " + minhaConta.getNome());
    }
}
