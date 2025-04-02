public class conta {

    int conta;
    String nome;
    float saldo;

    public conta( int conta, String nome, float saldo ){
        this.conta= conta;
        this.nome= nome;
        this.saldo= saldo;

    }

    public void depositar(float valor){

        if (valor > 0){
            saldo += valor;
            System.out.println(" Deposito no valor de R$ " + valor + " reais ");
        } else {
            System.out.println(" Saldo insuficiente para o deposito, tente novamente ! ");
        }
    }

    public void sacar(float valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println(" Saque de R$ " + valor );
            System.out.println(" Saque realizado " );

        } else {
            System.out.println(" Saldo insuficiente tente novamente ! ");
        }
    }


    public float getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void nome(String nome){

        if (nome != null && !nome.isEmpty()){
            this.nome=nome;
            System.out.println(" Digite o nome : ");
        } else {
            System.out.println(" Nome inválido, tente novamente");
        }
    }

}
