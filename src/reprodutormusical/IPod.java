package reprodutormusical;

public class IPod implements ReprodutorMusical{
    public void tocarMusica() {
        System.out.println("IPod inicia música.");
    }
    public void pausarMusica() {
        System.out.println("IPod pausa música.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("IPod seleciona " + musica + " foi selecionada");
    }
}
