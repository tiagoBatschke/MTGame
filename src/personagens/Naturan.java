package personagens;

public class Naturan extends Personagem {
    private String habilidade;

    public Naturan(String nome, int vida, String habilidade) {
        super(nome, vida);
        this.habilidade = habilidade;
    }

    @Override
    public void agir() {
        System.out.println(nome + " está agindo como um Naturan com habilidades de " + habilidade + ".");
    }
}
