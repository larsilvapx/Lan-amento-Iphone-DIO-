public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor Musical

    public void tocar() {

        System.out.println("tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("voce escolheu... " + musica);

    }

    // Aparelho telefonico

    public void ligar(String numero) {
        System.out.println("ligando para ... " + numero);
    }

    public void atender() {

        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioDeVoz() {

        System.out.println("voce tem uma mensagem no correio de voz");
    }

    // Navegador de internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

}
