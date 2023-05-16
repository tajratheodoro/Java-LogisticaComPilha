package Quest1.src;

import java.util.Stack;
import Quest1.Carga;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("CAMINHÃO 1");
        Caminhao caminhao2 = new Caminhao("CAMINHÃO 2");
        Caminhao caminhao3 = new Caminhao("CAMINHÃO 3");
        Caminhao caminhao4 = new Caminhao("CAMINHÃO 4");

        Carga carga1 = new Carga("CARGA 1", 2);
        Carga carga2 = new Carga("CARGA 2", 1);
        Carga carga3 = new Carga("CARGA 3", 3);
        Carga carga4 = new Carga("CARGA 4", 2);

        caminhao1.addEntrega(carga1);
        caminhao2.addEntrega(carga2);
        caminhao3.addEntrega(carga3);
        caminhao3.addEntrega(carga2);
        caminhao4.addEntrega(carga4);
        caminhao4.addEntrega(carga1);

        realizarEntregas(caminhao1);
        realizarEntregas(caminhao2);
        realizarEntregas(caminhao3);
        realizarEntregas(caminhao4);
    }

    public static void realizarEntregas(Caminhao caminhao) {
        System.out.printf("Entregas que serão realizadas pelo %s:%n", caminhao.getNome());
        Stack<Carga> pilhaEntregas = caminhao.getPilhaEntregas();
        
        while (!pilhaEntregas.empty()) {
            Carga carga = pilhaEntregas.pop();
            System.out.printf("Entrega da %s -> Seu nível de criticidade é: %d%n", carga.getDescricao(), carga.getNivelCritico());
        }

        System.out.printf("As entregas do %s foram concluídas com sucesso!%n", caminhao.getNome());
        System.out.println();
    }
}
