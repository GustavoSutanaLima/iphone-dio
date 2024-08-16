package navegadorinternet;

public class Safari implements NavegadorInternet {
    public  void exibirPagina(String url) {
        System.out.println("Safari exibi a página de URL: " + url + " na tela.");
    }
    public  void adcionarNovaAba() {
        System.out.println("Sarafi adiciona nova aba.");
    }
    public  void atualizarPagina() {
        System.out.println("Safari atualiza página");
    }
}
