public class CarroPrincipal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Toyota Corolla";
        carro1.ano = 2021;
        carro1.cor = "Preto";

        carro1.exibirCarro();

        System.out.println("Idade do carro: " + carro1.calcularIdadeCarro() + "anos.");
    }
}
