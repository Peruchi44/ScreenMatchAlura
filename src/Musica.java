public class Musica {
    String titulo;
    String artista;
    int anoDelancamento;
    double avaliacao;
    double numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Nome do(a) artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDelancamento);
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }
    double returnaMedia(){
        return avaliacao/numAvaliacoes;
    }

}
