package br.com.alura.screenmatch.modelo;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibiFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Tempo de duração do filme: " + duracaoMinutos);
    }

     public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double returnMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
