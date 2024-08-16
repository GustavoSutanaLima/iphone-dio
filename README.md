```mermaid
classDiagram
    interface ReprodutorMusical {
        + tocarMusica(): void
        + pausarMusica(): void
        + selecionarMusica(String musica): void
    }

    interface AparelhoTelefonico {
        + ligar(int numero): void
        + atender(): void
        + iniciarCorreioVoz(): void
    }

    interface NavegadorInternet {
        + exibirPagina(String url): void
        + adcionarNovaAba(): void
        + atualizarPagina(): void
    }

    class Iphone {
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
```