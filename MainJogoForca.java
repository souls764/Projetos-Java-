import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        
        sc.close();
    }
}
