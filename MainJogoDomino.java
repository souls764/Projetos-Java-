public class Main {
    public static void main(String[] args) {
        JogoDomino j = new JogoDomino();
        System.out.println("Peças iniciais:\n" + j);

        // retira 3 peças
        PecaDomino p1 = j.retirarPecaAleatoria();
        PecaDomino p2 = j.retirarPecaAleatoria();
        PecaDomino p3 = j.retirarPecaAleatoria();

        // mostra as peças retiradas e as restantes
        System.out.println("As peças retiradas foram " + p1 + ", " + p2 + " e " + p3);
        System.out.println("\nPeças restantes:\n" + j);
    }
}