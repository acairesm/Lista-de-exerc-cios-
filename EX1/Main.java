import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        String input = "";
        while (!input.equals("sair")) {


        System.out.println("CALCULADORA");
        System.out.println("------------------------------");

        System.out.println("SELECIONE A OPERAÇÃO [+][-][/][x]");
        char operador = leitor.next().charAt(0);

        System.out.println("DIGITE O PRIMEIRO VALOR:");
        int valor1 = leitor.nextInt();

        System.out.println("DIGITE O SEGUNDO VALOR:");
        int valor2 = leitor.nextInt();

        Calculadora calc = new Calculadora (valor1, valor2);

        if(operador == '+'){
            calc.CalcularAdicao();
        } else if (operador == '-'){
            calc.CalcularSubtracao();
        } else if (operador == 'x'){
            calc.Calcularmultiplicacao();
        } else if (operador == '/') {
            calc.Calculardivicao();
        }

        System.out.println("Digite 1 para continuar ou 0 para encerrar o programa: ");
            int escolha = leitor.nextInt();

            if (escolha == 0) {
                input = "sair";
            } else {
                input = "";
            }


    }
}
