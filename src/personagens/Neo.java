package personagens;

public class Neo extends Personagem {
    private boolean modificadoGeneticamente;

    public Neo(String nome, int vida, boolean modificadoGeneticamente) {
        super(nome, vida);
        this.modificadoGeneticamente = modificadoGeneticamente;
    }

    @Override
    public void agir() {
        System.out.println(nome + " está agindo como um Neo modificado geneticamente.");
    }
}
