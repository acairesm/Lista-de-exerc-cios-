    class contato {
    private String nome;
    private String telefone;

    public contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }


    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}