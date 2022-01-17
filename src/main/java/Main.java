public class Main {

    public static void main(String[] args){
        Cliente cliente = new Cliente();
       cliente.setNome("Fulano");


        IConta cc = new ContaCorrente(cliente);
        IConta cp = new ContaPoupanca(cliente);
        cc.depositar(100);
        cc.imprimirExtrato();

        cc.transferir(cp, 100);
        cp.imprimirExtrato();
        cc.imprimirExtrato();



    }



}
