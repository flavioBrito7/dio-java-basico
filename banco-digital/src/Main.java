
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Flavio Brito", "901.876.634-09", "Pessoa Física");
		Cliente cliente2 = new Cliente("José Maria", "987.937.123-00", "Pessoa Física");
        Cliente cliente3 = new Cliente("Fácil Locadora de Veículos", "12.345.678/0002-00", "Pessoa Jurídica");

		Conta contaCorrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente2);
        Conta contaCorrente2 = new ContaCorrente(cliente3);

        contaCorrente.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        System.out.println("\nExecutando depósitos nas contas correntes...");

		contaCorrente.depositar(1390);
        contaCorrente2.depositar(2387);

        System.out.println("\nConferindo saldos nas contas correntes...");

        contaCorrente.imprimirExtrato();
        contaCorrente2.imprimirExtrato();

        System.out.println("\nExecutando transferências para conta poupança e conta corrente...");

		contaCorrente.transferir(390, poupanca);
		contaCorrente2.transferir(2380, contaCorrente);

        System.out.println("\nConferindo saldos atuais das contas correntes...");

        contaCorrente.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
