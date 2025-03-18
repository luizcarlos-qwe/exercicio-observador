import java.math.BigDecimal;

public class Gerente implements Observador {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProduto, BigDecimal valor) {
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            System.out.println("Gerente " + nome + ": Valor do produto " + nomeProduto + " é maior que 1000.");
        }
    }
}
