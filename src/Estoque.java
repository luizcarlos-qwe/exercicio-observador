import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String produto;
    private BigDecimal valor;
    private List<Observador> observadores = new ArrayList<>();

    public Estoque(String produto, BigDecimal valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public void attach(Observador observador) {
        observadores.add(observador);
    }

    public void setValor(BigDecimal novoValor) {
        this.valor = novoValor;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(produto, valor);
        }
    }
}
