import java.util.Scanner;

public class Produto {
    String nome;
    int codigoDePrd;
    int QntDeEStoque;
    float preco;


    public Produto(String nome, int codigoDePrd, int qntDeEStoque, float preco){
        this.nome = nome;
        this.codigoDePrd = codigoDePrd;
        this.QntDeEStoque = qntDeEStoque;
        this.preco = preco;
    }


    public static Produto addProduto(Scanner leiotr){
        System.out.println("DIGITE O NOME");
        String nome = leiotr.nextLine();

        System.out.println("DIGITE O codigo do produto");
        int codigoDePrd = leiotr.nextInt();

        System.out.println("DIGITE a quantidade do estoque");
        int QntDeEStoque = leiotr.nextInt();

        System.out.println("DIGITE O preço");
        float preco = leiotr.nextFloat();

        return new Produto(nome, codigoDePrd, QntDeEStoque, preco);

    }


    public void modificarProduto(Scanner leitor) {
        System.out.println("ALTERANDO PRODUTO: " + nome);

        System.out.println("NOVO NOME (ou pressione ENTER para manter o atual):");
        String novoNome = leitor.nextLine();
        if (!novoNome.isEmpty()) {
            this.nome = novoNome;
        }

        System.out.println("NOVO CÓDIGO DO PRODUTO (ou 8 para manter o atual):");
        int novoCodigo = leitor.nextInt();
        if (novoCodigo != 8) {
            this.codigoDePrd = novoCodigo;
        }

        System.out.println("NOVA QUANTIDADE NO ESTOQUE (ou 8 para manter a atual):");
        int novaQuantidade = leitor.nextInt();
        if (novaQuantidade != 8) {
            this.QntDeEStoque = novaQuantidade;
        }

        System.out.println("NOVO PREÇO (ou 8 para manter o atual):");
        float novoPreco = leitor.nextFloat();
        leitor.nextLine();
        if (novoPreco != 8) {
            this.preco = novoPreco;
        }

        System.out.println("PRODUTO ATUALIZADO COM SUCESSO!");
    }


    public void exibirinfos() {
        System.out.println("ESTOQUE");
        System.out.println("-----------------------");

        System.out.println("NOME: " + nome );
        System.out.println("CODIGO DO PRODUTO: " + codigoDePrd );
        System.out.println("QUANTIDADE DO ESTOQUE: " + QntDeEStoque );
        System.out.println("PREÇO: " + preco );


    }


}

