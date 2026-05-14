public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoMinutos;

    void exibiFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Tempo de Duração do Filme: " + duracaoMinutos);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double returnMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
