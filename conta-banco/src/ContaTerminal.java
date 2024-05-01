import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in, "latin1");
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = in.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = in.next();

        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(in.next());

        System.out.print("Por favor, digite o número da agência: ");


        System.out.println("Olá" + nomeCliente + ", onrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        
    }
}
