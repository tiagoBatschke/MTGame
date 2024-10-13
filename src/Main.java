public class Main {
    public static void main(String[] args) {
        // Criando um objeto Personagem
        Personagem personagem = new Personagem( "Mago", "Humano", "Neutro");

        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Espécie: " + personagem.getEspecie());
        System.out.println("Inclinação Moral: " + personagem.getInclinacaoMoral());



    }
}
