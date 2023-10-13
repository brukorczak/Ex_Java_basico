package classes;

public abstract class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void acelerar();

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

}
