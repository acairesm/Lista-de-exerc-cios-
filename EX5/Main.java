import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Carro carro1 = new Carro("Toyota", "Corolla", 2022, "ABC-1234");

        System.out.println("Informações do carro antes de acelerar:");
        carro1.exibirInfo();


        while (true) {

            System.out.println("Deseja acelerar?[Y][N]");
            String opAc = leitor.nextLine();
            if (opAc.equalsIgnoreCase("y")) {
                carro1.acelerar();

            } else if (opAc.equalsIgnoreCase("n")) {
                System.out.println("Vc saiu da aceleração");
            }


            System.out.println("Deseja Frear? [Y][N]");
            String opFr = leitor.nextLine();
            if (opFr.equalsIgnoreCase("y")) {
                carro1.frear();
            } else if (opFr.equalsIgnoreCase("N")) {
                System.out.println("Vc saiu da freagem");

            }


            System.out.println("DESEJA EXIBIR AS NOSSAS INFOS DPS DA ACELERAÇÃO E FREAGEM[Y][N]");
            String opEb = leitor.nextLine();
            if (opEb.equalsIgnoreCase("y")) {
                carro1.exibirInfo();
            } else if (opEb.equalsIgnoreCase("N")) {
                System.out.println("Vc saiu ");

            }

        }
    }
}
