import java.util.Scanner;


public class Carro {



    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float velocidadeAtual;


    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public static Carro addCarro(Scanner leitor) {
        System.out.println("DIGITE A MARCA:");
        String marca = leitor.nextLine();

        System.out.println("DIGITE O MODELO:");
        String modelo = leitor.nextLine();

        System.out.println("DIGITE O ANO:");
        int ano = leitor.nextInt();
        leitor.nextLine();

        System.out.println("DIGITE A PLACA:");
        String placa = leitor.nextLine();

        return new Carro(marca, modelo, ano, placa);
    }


    public void acelerar(Scanner leitor) {
        System.out.println("ADICIONAR ACELERAÇÂO");
        int addAcelerar = leitor.nextInt();

        this.velocidadeAtual += addAcelerar;


        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
        leitor.nextLine();
    }

    public void frear(Scanner leitor) {
        System.out.println("ADICIONAR FREAGEM");
        int addFrear = leitor.nextInt();

        this.velocidadeAtual += addFrear;

        System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h");
        leitor.nextLine();

    }

    public void exibirInfo() {

        System.out.println("---------------------------");

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");

        System.out.println("---------------------------");


    }
}