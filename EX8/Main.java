import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> pizzas = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        // Adicionando pizzas ao cardápio
        pizzas.add(new Pizza(" Mussarela ", 30.0, List.of(" Mussarela ", "Tomate")));
        pizzas.add(new Pizza(" Calabresa ", 35.0, List.of(" Calabresa ", "Cebola", "Azeitona")));
        pizzas.add(new Pizza(" Portuguesa ", 40.0, List.of(" Presunto ", "Ovo", "Cebola", "Azeitona")));

        while (true) {
            System.out.println(" Bem-vindo à Pizzaria! ");
            System.out.println("1 Fazer pedido");
            System.out.println("2 Cancelar pedido");
            System.out.println("3 Relatório de pedidos");
            System.out.println("4 Adicionar nova pizza ao cardápio");
            System.out.println("5 Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    fazerPedido(scanner, pizzas, pedidos);
                    break;
                case 2:
                    cancelarPedido(scanner, pedidos);
                    break;
                case 3:
                    gerarRelatorio(pedidos);
                    break;
                case 4:
                    adicionarPizza(scanner, pizzas);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void fazerPedido(Scanner scanner, List<Pizza> pizzas, List<Pedido> pedidos) {
        System.out.println(" Cardápio: ");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + ". " + pizzas.get(i));
        }

        System.out.println("Digite o número da pizza desejada:");
        int numeroPizza = scanner.nextInt();
        scanner.nextLine();

        if (numeroPizza < 1 || numeroPizza > pizzas.size()) {
            System.out.println("Número de pizza inválido!");
            return;
        }

        Pizza pizzaEscolhida = pizzas.get(numeroPizza - 1);

        System.out.println("Digite o tamanho da pizza (pequena/média/grande):");
        String tamanho = scanner.nextLine();

        System.out.println(" Digite o endereço de entrega: ");
        String endereco = scanner.nextLine();

        Pedido pedido = new Pedido(pizzaEscolhida, tamanho, endereco);
        pedidos.add(pedido);

        System.out.println("Pedido realizado com sucesso!");
    }

    private static void cancelarPedido(Scanner scanner, List<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos para cancelar!");
            return;
        }

        System.out.println("\nPedidos:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + ". " + pedidos.get(i));
        }

        System.out.println("Digite o número do pedido a cancelar:");
        int numeroPedido = scanner.nextInt();
        scanner.nextLine();

        if (numeroPedido < 1 || numeroPedido > pedidos.size()) {
            System.out.println("Número de pedido inválido!");
            return;
        }

        pedidos.remove(numeroPedido - 1);
        System.out.println("Pedido cancelado com sucesso!");
    }

    private static void gerarRelatorio(List<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos para gerar relatório!");
            return;
        }

        System.out.println(" Relatório de Pedidos: ");
        double valorTotalPedidos = 0;
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
            valorTotalPedidos += pedido.calcularValorTotal();
        }

        System.out.println(" Total de pedidos: " + pedidos.size());
        System.out.println(" Valor total dos pedidos: R$ " + valorTotalPedidos);
        System.out.println(" Valor médio dos pedidos: R$ " + (valorTotalPedidos / pedidos.size()));
    }

    private static void adicionarPizza(Scanner scanner, List<Pizza> pizzas) {
        System.out.println(" Digite o nome da nova pizza: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor da nova pizza:");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite os ingredientes da nova pizza (separados por vírgula):");
        String ingredientesString = scanner.nextLine();
        List<String> ingredientes = List.of(ingredientesString.split(","));

        pizzas.add(new Pizza(nome, valor, ingredientes));
        System.out.println("Pizza adicionada ao cardápio com sucesso!");
    }
}