import java.util.Random;
import java.util.ArrayList;

public class JogoDomino {
    ArrayList<PecaDomino> pecas;

    public JogoDomino() {
        this.pecas = new ArrayList<PecaDomino>();

        for (int v1 = 0; v1 <= 6; v1++) {
            for (int v2 = v1; v2 <= 6; v2++) {
                this.pecas.add(new PecaDomino(v1, v2));
            }
        }
    }

    public String toString() {
        String s = "";
        int cont = 1;
        for (PecaDomino p: this.pecas) {
            s += p + " ";
            if (cont++ == 7) { // p/ mostrar de 7 em 7 peças por linha
                s += "\n";
                cont = 1;
            }
        }

        return s;
    }

    public PecaDomino retirarPecaAleatoria() {
        // sorteia uma dentre as peças existentes e guarda uma referência para ela,
        // para poder retorná-la ao final
        Random r = new Random();
        int pos = r.nextInt(this.pecas.size());
        PecaDomino retirada = this.pecas.get(pos);

        // cria um novo array com 1 elemento a menos
        ArrayList<PecaDomino> novo = new ArrayList<PecaDomino>();

        // copia para o novo array as peças até uma antes da sorteada
        for (int i = 0; i < pos; i++) {
            novo.add(this.pecas.get(i));
        }

        // copia para o novo array as peças depois da sorteada
        for (int i = pos + 1; i < this.pecas.size(); i++) {
            novo.add(this.pecas.get(i));
        }

        // troca o array de peças para o novo
        this.pecas = novo;

        // por fim, retorna a peça removida
        return retirada;
    }
}