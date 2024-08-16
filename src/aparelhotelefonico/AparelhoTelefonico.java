package aparelhotelefonico;

public interface AparelhoTelefonico {
    //Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
    public abstract void ligar(int numero);
    public abstract void atender();
    public abstract void iniciarCorreioVoz();
}
