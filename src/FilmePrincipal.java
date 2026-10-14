import br.com.alura.screenmatch.modelo.Filme;

public class FilmePrincipal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Tenet");
        meuFilme.setAnoLancamento(2020);
        meuFilme.setDuracaoMinutos(180);

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        meuFilme.avalia(4);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.returnMedia());
//        meuFilme.somaAvaliacoes = 10;
//        meuFilme.somaAvaliacoes = 1;
//
    }
}
