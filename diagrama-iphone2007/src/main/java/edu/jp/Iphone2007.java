package edu.jp;

public class Iphone2007 implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    public void pausar() {
        System.out.println("Pausando música...");
    }
    
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
    
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }
    
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }    

}
