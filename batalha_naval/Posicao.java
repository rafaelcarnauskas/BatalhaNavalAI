import java.util.Random;

public class Posicao {
    int x = -1;
    int y = -1;

    public void setPosicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public direcaoValida(Tabuleiro maze, Navio navio) {
        
    }

    public Posicao posicaoAleatoria() {
        Posicao p = new Posicao();
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        p.setPosicao(x, y);
        return p;
    }
}