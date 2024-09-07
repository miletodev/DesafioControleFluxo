public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("O segundo número precisa ser maior que o primeiro!");
    }
}
