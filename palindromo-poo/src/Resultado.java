
public class Resultado {

    private boolean valor;

    public Resultado(boolean valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor ? "Sim" : "Não";
    }

}
