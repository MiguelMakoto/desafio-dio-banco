public class ContaCorrente extends Conta{
    public ContaCorrente(long id, long agencia, String nome, double saldo) {
        super(id, agencia, nome, saldo);
        setTipo("Corrente");
    }

    public ContaCorrente(long id, long agencia, String nome) {
        super(id, agencia, nome);
        setTipo("Corrente");
    }

    @Override
    public String toString() {
        return String.format("CONTA CORRENTE\n") + super.toString();
    }
}
