import personagens.*;
import aventura.Aventura;
import utils.Narrativa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exibe o prólogo inicial do jogo
        Narrativa.exibirPrologo();

        // Seleção do personagem pelo usuário
        Personagem personagemSelecionado = Narrativa.selecionarPersonagem(scanner);

        // Criação de uma nova aventura e adição do personagem principal
        Aventura aventura = new Aventura();
        aventura.adicionarPersonagem(personagemSelecionado);

        // Adiciona NPCs (personagens não jogáveis) à aventura, como Irias
        Irias irias = new Irias();
        aventura.adicionarPersonagem(irias);

        try {
            System.out.println("\n--- Aventura Iniciada! ---\n");
            
            // Início da aventura com todos os personagens
            aventura.iniciar();
            
            // Interação narrativa inicial para o jogador
            Narrativa.narrativaInterativa(personagemSelecionado, scanner);
            
            // Ação de Irias no contexto da narrativa
            irias.emitirOrdemExterminio();
        } catch (Exception e) {
            System.out.println("Erro durante o jogo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
