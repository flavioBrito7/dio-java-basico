import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner in = new Scanner(System.in, "latin1"); 
        System.out.print("\nDigite o primeiro parâmetro: ");
        int parametroUm = Integer.parseInt(in.nextLine());
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = Integer.parseInt(in.nextLine());    
        contar(parametroUm, parametroDois);
        in.close();
    }
    
    public static void contar (int n1, int n2) throws ParametrosInvalidosException{
            if(n1 >= n2){
                throw new ParametrosInvalidosException();
            }
            int contagem = (n2 - n1);

            System.out.println("\nRelação de " + contagem + " números");
            for(int i = 0; i < contagem; i++){                   
                System.out.println("Imprimindo o número "+ n1);
                n1++; 
            }  
        }        
    }        

