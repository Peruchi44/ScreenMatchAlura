public class FilmePrincipal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Tenet";
        meuFilme.anoLancamento = 2020;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        meuFilme.avalia(4);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.returnMedia());
    }
}
