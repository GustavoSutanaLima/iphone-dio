package com.apple.smartphone;

import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocarMusica() {
        System.out.println("Toca música - Iphone");
    }

    public void pausarMusica() {
        System.out.println("Pausa música - Iphone");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Seleciona música" + musica +" - Iphone");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibi URL" + url +" - Iphone");  
    }

    public void adcionarNovaAba() {
        System.out.println("Nova aba - Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualiza página iphone - Iphone");
    }

    public void ligar(int numero) {
        System.out.println("Liga para numero " + numero + " - Iphone");
    }

    public void atender() {
        System.out.println("Atende ligação - Iphone");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Inicia correio de voz - Iphone");
    }
    
}
