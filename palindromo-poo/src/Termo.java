
public class Termo {

    private String valor;

    public Termo(String valor) {
        this.valor = valor;
    }

    public Resultado ehPalindromo() {
        return new Resultado(valorEhIgualAoInversoDele());
    }

    private boolean valorEhIgualAoInversoDele() {
        return valor.equals(Util.inverter(valor));
    }

    @Override
    public String toString() {
        return valor;
    }
}
