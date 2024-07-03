import java.util.Random;

public class JogoForca {
    private String palavra;
    private int erros;
    private char[] palavraLetras;
    private String[] palavrasArray = {"abacate", "elefante", "computador", "passarinho", "cachorro", "flor", "livro", "lapis", "casa", "arvore"};

    public JogoForca() {
        this.palavra = getPalavra();
        //System.out.println(palavra);

        palavraLetras = new char[this.palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            this.palavraLetras[i] = '-';
        }
        this.erros = 0;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < palavra.length(); i++) {
            s += palavraLetras[i] + " ";
        }
        s += "   Num. erros = " + this.erros;

        return s;
    }

    public int getErros() {
        return this.erros;
    }

    public void verificar(char letra) {
        boolean found = false;
        for (int i = 0; i < palavra.length(); i++) {
            if (this.palavra.charAt(i) == letra) {
                palavraLetras[i] = letra;
                found = true;
            }
        }
        if (!found) {
            this.erros++;
        }
    }

    public String getPalavra() {
        Random r = new Random();
        return this.palavrasArray[r.nextInt(this.palavrasArray.length)];
    }

    public boolean acabou() {
        String temp = new String(palavraLetras);
        return this.palavra.equals(temp);
    }
}

/*
System.out.println("== Jogo da Forca ==");

        JogoForca jf = new JogoForca();

        do{
            System.out.println(jf);
            System.out.println();
            System.out.println("Qual letra deseja chutar?");
            char letra = sc.next().charAt(0);
            jf.verificar(letra);

        } while(jf.getErros() != 5 && !jf.acabou());

        System.out.println(jf);

        if(jf.getErros() == 5) {
            System.out.println("\nVocê perdeu! Tente novamente!");
        } else {
            System.out.println("\nVocê ganhou! Parabéns");
        }
*/
