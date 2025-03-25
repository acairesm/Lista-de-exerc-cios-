import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();

        System.out.println("CARROS:");
        System.out.println("--------------------------");

        while (true) {
            System.out.println("Deseja adicionar um novo carro? [Y/N]");
            String resposta = leitor.nextLine();

            if (resposta.equalsIgnoreCase("y")) {
                Carro novoCarro = Carro.addCarro(leitor);
                carros.add(novoCarro);
                System.out.println("Carro cadastrado com sucesso!");

                System.out.println("Deseja acelerar? [Y/N]");
                String opAc = leitor.nextLine();
                if (opAc.equalsIgnoreCase("y")) {
                    novoCarro.acelerar(leitor);
                }

                System.out.println("Deseja frear? [Y/N]");
                String opFr = leitor.nextLine();
                if (opFr.equalsIgnoreCase("y")) {
                    novoCarro.frear(leitor);
                }


                System.out.println("Deseja exibir as informações de todos os carros cadastrados? [Y/N]");
                String opEb = leitor.nextLine();
                if (opEb.equalsIgnoreCase("y")) {
                    for (Carro carro : carros) {
                        carro.exibirInfo();
                    }
                }

            } else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Saindo do programa...");
                break; 
            } else {
                System.out.println("Opção inválida! Digite 'Y' para adicionar ou 'N' para sair.");
            }
        }

        leitor.close();
    }
}
