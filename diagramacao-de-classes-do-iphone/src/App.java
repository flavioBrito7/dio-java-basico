import smartPhone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone("jdk2345", "Iphone 10" );

        System.out.println("\nApresentando o novo "+ iphone.getModelo() + ", série " + iphone.getNumeroSerie());

        System.out.println("\n--------------------\nAcessando o telefone...\n");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("--------------------\nAcessando a internet...\n");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("--------------------\nAcessando Ipod...\n");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
      
        System.out.println("\n--------------------\nEncerrando apresentação...");

        

       

    }
}
