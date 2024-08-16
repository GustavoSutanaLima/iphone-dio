import com.apple.smartphone.Iphone;

import aparelhotelefonico.AparelhoTelefonico;
import aparelhotelefonico.Phone;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.IPod;
import reprodutormusical.ReprodutorMusical;

public class Usuário {
    public static void main(String[] args) {
        
        Iphone ip = new Iphone();

        AparelhoTelefonico telefone = new Phone();

        Phone telePhone = new Phone();

        AparelhoTelefonico ip2 = new Iphone();

        NavegadorInternet navegadorInternet = ip;

        ReprodutorMusical reprodutorMusical = ip;

        telefone.ligar(998845567);
        navegadorInternet.atualizarPagina();
        reprodutorMusical.selecionarMusica("Spiritual Migration");

        ip.ligar(998845567);


        


        
    }
}
