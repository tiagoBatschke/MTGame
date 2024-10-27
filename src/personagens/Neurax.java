package personagens;

public class Neurax extends Personagem {
    private String papel;

    public Neurax(String nome, int vida, String papel) {
        super(nome, vida);
        this.papel = papel;
    }

    @Override
    public void agir() {
        System.out.println(nome + " está agindo como um Neurax com o papel de " + papel + ".");
    }
}
