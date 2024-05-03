import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, "latin1"); 

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = Integer.parseInt(in.nextLine());

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = Integer.parseInt(in.nextLine());

        try{
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException e){
            e.printStackTrace();
        }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException() {

            if(parametroUm < parametroDois){
                throw new ParametrosInvalidosException();
            }else{
                int contagem = (parametroDois - parametroUm);
                for(int i = 0; i <= contagem; i++)
                System.out.print("Relação de " + contagem + "número:");
                System.out.print(contagem); 
            }      
        }
    }
}
