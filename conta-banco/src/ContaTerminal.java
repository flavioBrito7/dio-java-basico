import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Instanciando o objeto "Scanner" e criando atributos da classe "ContaTerminal".
        Scanner in = new Scanner(System.in, "latin1");
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        //Recebendo, via terminal, o dados da conta...
        System.out.print("\n------------------------------------------------------\nPor favor, digite o nome do cliente: ");
        nomeCliente = in.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        agencia = in.next();
        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(in.next());

        //Encerrando a atividade da instância do objeto Scanner
        in.close();

        System.out.println("------------------------------------------------------\nOlá, " + nomeCliente + "!\nObrigado por criar uma conta em nosso banco!\nA sua agência é " + agencia + " e a sua conta " + numero + ".\nSeu saldo de R$" + saldo + " já está disponível para saque.\n------------------------------------------------------");
        
    }
}
