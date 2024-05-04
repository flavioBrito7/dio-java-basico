package smartPhone;

import gadgets.ReprodutorMusical;
import gadgets.AparelhoTelefonico;
import gadgets.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    String numeroSerie;
    String modelo;

    public Iphone(String numeroSerie, String modelo) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
    }
    
    //Métodos do Telefone...
    public void ligar(){
        System.out.println("Ligando telefone...");
    };
    public void atender(){
        System.out.println("Atendendo ligação...");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Iniciado correio de voz...");
    };

    //Métodos do Ipod...
    public void tocarMusica(){
        System.out.println("Tocando música...");
    };
    public void pausarMusica(){
        System.out.println("Pausando música...");
    };
    public void selecionarMusica(){
        System.out.println("Selecionando música...");
    };

     //Métodos do Netscape...
     public void exibirPagina(){
        System.out.println("Exibindo página web...");
     };
     public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba de página web...");
     };
     public void atualizarPagina(){
        System.out.println("Atualizando a página web...");
     }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }
     
}
