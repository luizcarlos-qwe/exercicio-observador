import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1900.0");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial);

        estoque.attach(gerente);
        estoque.setValor(valorInicial);
    }
}
