import java.util.Random;

public class Navio {
    int tamanho;
    Posicao[] pontos; // vai armazenar todas as posições do navio
    int vida;

    public int danificar() {
        return --vida;
    }

    public void removeParte(Posicao p, Tabuleiro maze) {
        for (Posicao j : pontos) {
            if (j.x == p.x && j.y == p.y) {
                maze.tabuleiro[j.x][j.y] = 0;
                this.danificar();
            }
        }
    }

    public int estadoDoNavio() {
        return vida;
    }

    public Tabuleiro escolhePosicao(Tabuleiro maze) {
        Posicao p = new Posicao();
        p = p.posicaoAleatoria();

        while (maze.tabuleiro[p.x][p.y] != 0) {
            p = p.posicaoAleatoria();
        }

        return maze;
    }
}