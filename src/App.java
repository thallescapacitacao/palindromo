public class App {
    public static void main(String[] args) throws Exception {
        imprimirNoTerminalSeEhPalindromoOuNao("aaa");
        imprimirNoTerminalSeEhPalindromoOuNao("abc");
        imprimirNoTerminalSeEhPalindromoOuNao("axa");
        imprimirNoTerminalSeEhPalindromoOuNao("defg");
    }

    private static void imprimirNoTerminalSeEhPalindromoOuNao(String termo) {
        System.out.println("\"" + termo + "\" é um palíndromo? " + (ehPalindromo(termo) ? "Sim" : "Não") + ".");
    }

    private static boolean ehPalindromo(String termo) {
        return termo.equals(inverso(termo));
    }

    private static String inverso(String termo) {
        if (nuloOuVazio(termo)) {
            return termo;
        }
        return caracterNaUltimaPosicao(termo) + inverso(caracteresAnterioresAUltimaPosicao(termo));
    }

    private static String caracteresAnterioresAUltimaPosicao(String termo) {
        return termo.substring(0, termo.length() - 1);
    }

    private static char caracterNaUltimaPosicao(String termo) {
        return termo.charAt(termo.length() - 1);
    }

    private static boolean nuloOuVazio(String termo) {
        return termo == null || termo.isEmpty();
    }
}
