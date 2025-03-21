public class Calculadora {
    int adicao;
    int multiplicacao;
    float divicao;
    float subtracao;
    int valor1;
    int valor2;

    Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int CalcularAdicao() {
        int somaAdicao = valor1 + valor2;
        System.out.println(":" + somaAdicao);
        return multiplicacao;
    }


    public float CalcularSubtracao() {
        float somaSubtracao = valor1 - valor2;
        System.out.println(":" + somaSubtracao);
        return subtracao;
    }


    public  int Calcularmultiplicacao() {
        int somaMultiplicao = valor1 * valor2;
        System.out.println(":" + somaMultiplicao);
        return adicao;
    }

    public  float Calculardivicao() {
        float somaDivicao = valor1 / valor2;
        System.out.println(":" + somaDivicao);
        return divicao;
    }

}
