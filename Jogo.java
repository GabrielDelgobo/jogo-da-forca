import java.util.HashSet;
import java.util.Set;

public class Jogo {
    private Palavra palavra;
    private Set<Character> letrasChutadas;
    private int errosMaximos = 6;
    private int erros;

    public Jogo(Jogador jogador, Palavra palavra) {
        this.palavra = palavra;
        this.letrasChutadas = new HashSet<>();
        this.erros = 0;
    }

    public boolean jogar(char letra) {
        letra = Character.toUpperCase(letra);
        if (letrasChutadas.contains(letra)) {
            return true; 
        }
        letrasChutadas.add(letra);

        if (palavra.getPalavra().contains(String.valueOf(letra))) {
            return true; 
        } else {
            erros++;
            return false; 
        }
    }

    public boolean ganhou() {
        for (char c : palavra.getPalavra().toCharArray()) {
            if (!letrasChutadas.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean perdeu() {
        return erros >= errosMaximos;
    }

    public String getEstadoAtual() {
        StringBuilder sb = new StringBuilder();
        for (char c : palavra.getPalavra().toCharArray()) {
            if (letrasChutadas.contains(c)) {
                sb.append(c).append(" ");
            } else {
                sb.append("_ ");
            }
        }
        return sb.toString();
    }

    public int getErrosRestantes() {
        return errosMaximos - erros;
    }
}
