package aparelhotelefonico;

public class Phone implements AparelhoTelefonico {
    public  void ligar(int numero) {
        System.out.println("Phone ligando para o número: " + numero);
    }
    public  void atender() {
        System.out.println("Phone atende ligação.");
    }
    public  void iniciarCorreioVoz(){
        System.out.println("Phone cria mensagem no correio de voz.");
    }
}
