package funcionalidades.Elementos;
import java.util.Set;
import java.util.HashSet;
import java.util.Optional;

public class Banco {
    Set<Conta> contas;

    public Banco() {
        contas = new HashSet<>();
    }

    public boolean adicionarCliente(long id, long agencia, String nome, double saldo, String tipo) {
        
        Conta contaAdicionada;

        if (tipo.startsWith("p"))
            contaAdicionada = new ContaPoupanca(id, agencia, nome, saldo);
        else if (tipo.startsWith("c"))
            contaAdicionada = new ContaCorrente(id, agencia, nome, saldo);
        else return false;
        
        if (contas.contains(contaAdicionada)) {
            return false;
        }
        else {
            contas.add(contaAdicionada);
            return true;
        }
    }

    public boolean adicionarCliente(long id, long agencia, String nome, String tipo) {
        Conta contaAdicionada;

        if (tipo.startsWith("p"))
            contaAdicionada = new ContaPoupanca(id, agencia, nome);
        else if (tipo.startsWith("c"))
            contaAdicionada = new ContaCorrente(id, agencia, nome);
        else return false;

        if (contas.contains(contaAdicionada)) {
            return false;
        }
        else {
            contas.add(contaAdicionada);
            return true;
        }
    }

    //remocao por id e agencia
    public boolean removerCliente(long id, long agencia) {
        Conta retirar = null;
        
        if (!contas.isEmpty() && 
            contas.stream().anyMatch(n -> n.getId() == id && n.getAgencia() == agencia)) {
            for (Conta c : contas) {
                if (c.getId() == id && c.getAgencia() == agencia) {
                    retirar = c;
                    break;
                }
            }
            contas.remove(retirar);
            return true;
        }
        else return false;
    }

    //remocao por nome
    public boolean removerCliente(String nome) {
        Conta retirar = null;

        if (!contas.isEmpty() && 
            contas.stream().anyMatch(n -> n.getNome().equalsIgnoreCase(nome))) {
            for (Conta c : contas) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    retirar = c;
                    break;
                }
            }
            contas.remove(retirar);
            return true;
        }
        else return false;
    }

    public double valorTotalEmCirculacao() {
        return contas.stream().mapToDouble(c -> c.getSaldo()).sum();
    }

    public Optional<Conta> buscaCliente(long id, long agencia) {
        Optional<Conta> retorno = Optional.empty();

        if (!contas.isEmpty()) {
            for (Conta c : contas) {
                if (c.getAgencia() == agencia && c.getId() == id)
                    retorno = Optional.ofNullable(c);
            }
        }

        return retorno;
    }

    public Optional<Conta> buscaCliente(String nome) {
        Optional<Conta> retorno = Optional.empty();

        if (!contas.isEmpty()) {
            for (Conta c : contas) {
                if (c.getNome().equalsIgnoreCase(nome))
                    retorno = Optional.ofNullable(c);
            }
        }

        return retorno;
    }

    @Override
    public String toString() {
        return contas.stream().map(c -> c.toString()).toList().toString();
    }
}
