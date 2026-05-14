public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Innerbloom";
        musica1.artista = "Rüfus Du Sol";
        musica1.anoDelancamento = 2021;

        musica1.exibirFichaTecnica();
        musica1.avaliaMusica(10);
        musica1.avaliaMusica(4);
        musica1.avaliaMusica(10);
        musica1.avaliaMusica(8);
        System.out.println(musica1.titulo);
        System.out.println(musica1.artista);
        System.out.println(musica1.anoDelancamento);
        System.out.println("A média de notas para a música " + musica1 + " é: " + musica1.returnaMedia());
    }
}
