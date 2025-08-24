public class ContaPoupanca extends Conta {

    public ContaPoupanca(long id, long agencia, String nome, double saldo) {
        super(id, agencia, nome, saldo);
        setTipo("Poupanca");
    }

    public ContaPoupanca(long id, long agencia, String nome) {
        super(id, agencia, nome);
        setTipo("Poupanca");
    }

    @Override
    public String toString() {
        return String.format("CONTA POUPANCA\n") + super.toString();
    }

}
