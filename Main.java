import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nome = sc.nextLine();
        Jogador jogador = new Jogador(nome);

        // Lista de palavras possíveis
        String[] listaPalavras = {
            "computador", "java", "programacao", "teclado",
            "monitor", "internet", "celular", "guitarra",
            "hospital", "mercado", "professor", "engenheiro",
            "pizza", "futebol", "parque"
        };

        // Escolhe uma palavra aleatória
        Random random = new Random();
        String palavraSecreta = listaPalavras[random.nextInt(listaPalavras.length)];
        Palavra palavra = new Palavra(palavraSecreta);

        Jogo jogo = new Jogo(jogador, palavra);

        System.out.println("\n--- Jogo da Forca ---");
        while (!jogo.ganhou() && !jogo.perdeu()) {
            System.out.println("\nPalavra: " + jogo.getEstadoAtual());
            System.out.println("Erros restantes: " + jogo.getErrosRestantes());

            System.out.print("Digite uma letra: ");
            char chute = sc.nextLine().charAt(0);

            boolean acertou = jogo.jogar(chute);
            if (acertou) {
                System.out.println("Boa! Você acertou.");
            } else {
                System.out.println("Letra errada!");
            }
        }

        if (jogo.ganhou()) {
            System.out.println("\nParabéns, " + jogador.getNome() + "! Você venceu!");
        } else {
            System.out.println("\nVocê perdeu! A palavra era: " + palavra.getPalavra());
        }

        sc.close();
    }
}
