import java.util.Optional;

public class AppBanco {
    public static void main(String[] args) throws Exception {
        //Set<Conta> lista = new HashSet<>();
        Banco banco = new Banco();
        System.out.println(banco.adicionarCliente(1, 1, "Gregory", "poupanca") ?
                            "Conta adicionada." : "Conta nao adicionada.");
        
        System.out.println(banco.adicionarCliente(2, 1, "Flavio", "poupanca") ?
                            "Conta adicionada." : "Conta nao adicionada.");
        System.out.println(banco.adicionarCliente(1, 2, "Pedrinho", "corrente") ?
                            "Conta adicionada." : "Conta nao adicionada.");
        System.out.println(banco.adicionarCliente(3, 1, "Carolina", "corrente") ?
                            "Conta adicionada." : "Conta nao adicionada.");
        System.out.println(banco.toString());

        System.out.println(banco.removerCliente(1, 2) ? "Cliente removido." : "Falha na operacao.");
        System.out.println(banco.removerCliente("pedrinho") ? "Cliente removido." : "Falha na operacao.");

        for (int i = 0; i < 31; i++) System.out.print("=");
        
        Optional<Conta> selecionado = banco.buscaCliente("gregory");
        if (selecionado.isPresent()) selecionado.get().deposito(2450.12);
        else System.out.println("\nNao foi possivel depositar.");

        selecionado = banco.buscaCliente(2, 1);
        if (selecionado.isPresent()) selecionado.get().deposito(1068.17);
        else System.out.println("\nNao foi possivel depositar.");

        
        System.out.println("\n" + banco.toString());
        
        System.out.println(String.format("Valor total em circulacao: R$%.2f", 
                                            banco.valorTotalEmCirculacao()));
        
        for (int i = 0; i < 31; i++) System.out.print("=");

        System.out.println(selecionado.isPresent() ? "\n" + selecionado.get().toString() : "Nao foi possivel acessar o usuario.");


        /* 
        lista.add(new Conta(1, 1, "Gregory"));
        lista.add(new Conta(2, 1, "Pedrinho"));
        lista.add(new Conta(1, 1, "Flavio Vitor"));
        lista.add(new Conta(2, 2, "Ronaldo"));
        System.out.println(lista.toString());
        //*/
    }
}
