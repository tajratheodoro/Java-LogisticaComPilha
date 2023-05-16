package Quest1.src;

import java.util.Stack;
import Quest1.Carga;

public class Caminhao {
    private String nome;
    private Stack<Carga> pilhaEntregas;

    public Caminhao(String nome) {
        this.nome = nome;
        this.pilhaEntregas = new Stack<>();
    }

    public String getNome() {
        return nome;
    }

    public Stack<Carga> getPilhaEntregas() {
        return pilhaEntregas;
    }

    public void addEntrega(Carga carga) {
        pilhaEntregas.push(carga);
    }

    public Carga deleteEntrega() {
        return pilhaEntregas.pop();
    }
}
