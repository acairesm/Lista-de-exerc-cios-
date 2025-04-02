public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private String enderecoEntrega;

    public Pedido(Pizza pizza, String tamanho, String enderecoEntrega) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.enderecoEntrega = enderecoEntrega;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public double calcularValorTotal() {
        double valorTotal = pizza.getValor();
        if (tamanho.equalsIgnoreCase("grande")) {
            valorTotal *= 1.2; // Aumenta 20% para pizzas grandes
        }
        return valorTotal;
    }


    public String toString() {
        return "Pizza: " + pizza.getNome() + ", Tamanho: " + tamanho + ", Endereço: " + enderecoEntrega + ", Valor: R$ " + calcularValorTotal();
    }
}
