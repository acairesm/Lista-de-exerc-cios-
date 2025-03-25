import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> Produtos = new ArrayList<>();


        System.out.println("MERCADO");
        System.out.println("-------------------------");

        while (true) {

            System.out.println("""
                    [0] ADICIONAR PRODUTO
                    [1] ATUALIZAR INFORMAÇOES DO PRODUTO
                    [2] REMOVER PRODUTO
                    [3] SAIR
                    [4] ESTOQUE
                    """);

            String op = leitor.nextLine();



            if (op.equalsIgnoreCase("0")) {
                Produto novoProduto = Produto.addProduto(leitor);
                Produtos.add(novoProduto);
            }

            if (op.equalsIgnoreCase("4")) {
                if (Produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (Produto produto : Produtos) {
                        produto.exibirinfos();
                    }
                }
            }

            if (op.equalsIgnoreCase("1")) {
                if (Produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado para modificar.");
                } else {
                    System.out.println("Qual o nome do produto que deseja alterar?");
                    String nomeBusca = leitor.nextLine();

                    boolean encontrado = false;
                    for (Produto produto : Produtos) {
                        if (produto.nome.equalsIgnoreCase(nomeBusca)) {
                            produto.modificarProduto(leitor);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                }
            }

            if (op.equalsIgnoreCase("2")) {

                for (Produto produto : Produtos) {
                    produto.exibirinfos();
                }

                if (Produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado para remover.");
                } else {
                    System.out.println("Qual o nome do produto que deseja remover?");
                    String nomeBusca = leitor.nextLine();

                    boolean removido = Produtos.removeIf(produto -> produto.nome.equalsIgnoreCase(nomeBusca));

                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                }
            }

        if(op.equalsIgnoreCase("3")){
            break;
            }
        }
    }
}