public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente murilo = new Cliente();
        murilo.setNome("Murilo");

        Conta cc = new ContaCorrente(murilo);
        Conta poupanca = new ContaPoupanca(murilo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
