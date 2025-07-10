import java.util.List;

public class Tabuleiro {
    int[][] tabuleiro = new int[10][10];
    List<Navio> navios;

    public void preencherTabuleiro() {
        for (Navio n : navios) {
            for (Posicao p : n.pontos) {
                tabuleiro[p.x][p.y] = 1;
            }
        }
    }

    public Navio navioAcertado(Posicao p) {
        for (Navio n : navios) {
            for (int i = 0; i < n.tamanho; i++) {
                if (p.x == n.pontos[i].x && p.y == n.pontos[i].y) {
                    n.removeParte(p, this);
                    tabuleiro[p.x][p.y] = 0;
                    return n;
                }
            }
        }
        return null;
    }

    public int jogada(Posicao missil) { /////////ta errado ainda
        if (tabuleiro[missil.x][missil.y] == 1) {
            Navio n = navioAcertado(missil);
            n.removeParte(missil, this);
            System.out.println("Acertou meu navio fdp");
            return 1;
        } else
            System.out.println("Errou, acertou a agua seu fudido");
        return 0;
    }
}
