
public class Util {

    public static String inverter(String valor) {
        if (nuloOuVazio(valor)) {
            return valor;
        }
        return caracterNaUltimaPosicao(valor) + inverter(caracteresAnterioresAUltimaPosicao(valor));
    }

    private static String caracteresAnterioresAUltimaPosicao(String valor) {
        return valor.substring(0, valor.length() - 1);
    }

    private static char caracterNaUltimaPosicao(String valor) {
        return valor.charAt(valor.length() - 1);
    }

    private static boolean nuloOuVazio(String valor) {
        return valor == null || valor.isEmpty();
    }

}
