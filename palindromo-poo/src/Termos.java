import java.util.ArrayList;
import java.util.List;

public class Termos {

    private List<Termo> termos;

    public Termos(String... valores) {
        this.termos = transformarEmLista(valores);
    }

    private List<Termo> transformarEmLista(String[] valores) {
        List<Termo> lista = new ArrayList<Termo>();
        for (String valor : valores) {
            lista.add(new Termo(valor));
        }
        return lista;
    }

    public List<Termo> lista() {
        return termos;
    }

}
