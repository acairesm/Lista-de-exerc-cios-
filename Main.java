//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        agenda minhaAgenda = new agenda();
        Scanner scanner = new Scanner(System.in);


        minhaAgenda.adicionarContato(new contato("João", "1234-5678"));
        minhaAgenda.adicionarContato(new contato("Maria", "9876-5432"));
        minhaAgenda.adicionarContato(new contato("Carlos", "5555-1234"));

        while (true) {
            System.out.println(" Escolha uma opção  :");
            System.out.println("1 : Listar contatos");
            System.out.println("2 :Buscar contato por nome");
            System.out.println("3 :Adicionar contato");
            System.out.println("4 :Remover contato");
            System.out.println("5 :Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println(" Lista de contatos : ");
                    minhaAgenda.listarContatos();
                    break;
                case 2:
                    System.out.println(" Digite o nome do contato a buscar : ");
                    String nomeBusca = scanner.nextLine();
                    contato contatoEncontrado = minhaAgenda.buscarContato(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado : ");
                        System.out.println(contatoEncontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println(" Digite o nome do novo contato : ");
                    String novoNome = scanner.nextLine();
                    System.out.println("Digite o telefone do novo contato : ");
                    String novoTelefone = scanner.nextLine();
                    minhaAgenda.adicionarContato(new contato(novoNome, novoTelefone));
                    System.out.println(" Contato adicionado com sucesso ! ");
                    break;
                case 4:
                    System.out.println(" Digite o nome do contato a remover : ");
                    String nomeRemover = scanner.nextLine();
                    contato contatoParaRemover = minhaAgenda.buscarContato(nomeRemover);
                    if (contatoParaRemover != null) {
                        minhaAgenda.removerContato(contatoParaRemover);
                        System.out.println(" Contato removido com sucesso ! ");
                    } else {
                        System.out.println("Contato não encontrado ! Tente novamente . ");
                    }
                    break;
                case 5:
                    System.out.println(" Saindo, até logo ");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Opção inválida, tente novamente ! ");
            }
        }
    }
}