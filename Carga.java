package Quest1;

public class Carga {
    private String descricao;
    private int nivelCritico;

    public Carga(String descricao, int nivelCritico) {
        this.descricao = descricao;
        this.nivelCritico = nivelCritico;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNivelCritico() {
        return nivelCritico;
    }
}
