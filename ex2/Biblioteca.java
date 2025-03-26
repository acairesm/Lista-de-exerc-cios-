class Biblioteca {
    String titulo;
    String autor;
    int ano;

    public Biblioteca(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }


    public void exibiInfo() {
        System.out.println("TÍTULO: " + titulo + " | AUTOR: " + autor + " | ANO: " + ano);
    }
}
