class Biblioteca {
    String titulo;
    String autor;
    int ano;

    public Biblioteca(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }


    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano;
    }
}