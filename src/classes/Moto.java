package classes;

public class Moto extends Veiculo{
    public Moto(String marca, int ano){
        super(marca, ano);
    }

    @Override
    public void acelerar(){
        System.out.println("A moto acelera rampampamapampmapamapa pa pa");
    }
}
