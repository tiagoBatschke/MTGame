package personagens;

public class Irias extends Personagem {
    public Irias() {
        super("Irias", 100);
    }

    public void emitirOrdemExterminio() {
        System.out.println("Irias emite uma ordem de extermínio contra os Naturans.");
    }

    @Override
    public void agir() {
        System.out.println("Irias está monitorando o mundo de Celestus.");
    }
}
