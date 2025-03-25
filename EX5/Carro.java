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


    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
