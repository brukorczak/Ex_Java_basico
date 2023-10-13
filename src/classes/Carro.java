package classes;

public class Carro extends Veiculo{
    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro acelera vrum vrum");
    }

}
