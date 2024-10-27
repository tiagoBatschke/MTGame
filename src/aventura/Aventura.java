package aventura;

import personagens.Personagem;
import java.util.ArrayList;
import java.util.List;

public class Aventura {
    private List<Personagem> personagens = new ArrayList<>();

    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public void iniciar() {
        for (Personagem personagem : personagens) {
            System.out.println(personagem.getNome() + " entrou na aventura!");
            personagem.agir();
        }
    }
}
