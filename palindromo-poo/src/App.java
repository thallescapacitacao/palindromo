
public class App {
    public static void main(String[] args) throws Exception {

        Termos termos = new Termos("aaa", "abc", "axa", "defg");

        for (Termo termo : termos.lista()) {
            Terminal.imprimir(Pergunta.PALINDROMO_SIM_NAO, termo, termo.ehPalindromo());
        }

    }
}
