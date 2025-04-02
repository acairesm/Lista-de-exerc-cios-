import java.util.ArrayList;
import java.util.List;

public class agenda {
    private List<contato> contatos;

    public agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(contato contato) {
        this.contatos.add(contato);
    }

    public void removerContato(contato contato) {
        this.contatos.remove(contato);
    }

    public contato buscarContato(String nome) {
        for (contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        for (contato contato : contatos) {
            System.out.println(contato);
        }
    }
}