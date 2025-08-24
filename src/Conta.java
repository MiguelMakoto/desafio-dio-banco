import java.util.Objects;

public abstract class Conta implements Comparable<Conta>{
    private long id;
    private long agencia;
    private String nome;
    private double saldo;
    private String tipo;

    public Conta(long id, long agencia, String nome, double saldo) {
        this.id = id;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    //caso nao seja informado o saldo inicial
    public Conta(long id, long agencia, String nome) {
        this.id = id;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = 0;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getAgencia() {
        return agencia;
    }
    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    //retorna true se concluida com sucesso, false para sem sucesso
    public boolean saque(double valorSacado) {
        if (valorSacado > this.saldo) {
            return false;
        }
        saldo -= valorSacado;
        return true;
    }

    //retorna true se concluida com sucesso, false para sem sucesso
    public boolean transferencia(double valorTransferido, Conta alvo) {
        if (valorTransferido > saldo || alvo.equals(null) || alvo.equals(this)) {
            return false;
        }
        else {
            alvo.deposito(valorTransferido);
            this.saque(valorTransferido);
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nId da conta/Agencia: %d/%d\nSaldo em conta: R$%.2f\n",
                                nome, id, agencia, saldo);
    }

    @Override
    public boolean equals(Object c) {
        if (c == this) return true;
        else if (!(c instanceof Conta conta)) return false;
        else {
            if (this.getAgencia() == conta.getAgencia())
                return this.getId() == conta.getId();
            else
                return this.getAgencia() == conta.getAgencia();
        }
    }

    @Override
    public int compareTo(Conta c) {
        if (this.agencia == c.agencia)
            return Long.compare(this.id, c.id);
        else
            return Long.compare(this.agencia, c.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAgencia() + getId());
    }

}
