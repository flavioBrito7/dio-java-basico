import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        //Criando o objeto Scanner...
        Scanner in = new Scanner(System.in);
   
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
    
        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(in.nextLine());

        in.close();

        System.out.println("O seu nome é " 
                                        + nome + " e você tem " 
                                        + altura + " de altura.");
    }
}
