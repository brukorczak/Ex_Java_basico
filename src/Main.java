import classes.Carro;
import classes.Moto;
import classes.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Veiculos 🚘🏍️--------");
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Chevrolet Opala", 1968));
        veiculos.add(new Moto("Suzuki", 1952));

        Veiculo veiculoMaisAntigo = veiculos.stream()
                .min((v1, v2) -> Integer.compare(v1.getAno(), v2.getAno()))
                .orElse(null);

        if (veiculoMaisAntigo != null) {
            System.out.println("\n Veiculo mais antigo ");
            System.out.println("Marca: " + veiculoMaisAntigo.getMarca());
            System.out.println("Ano de: " + veiculoMaisAntigo.getAno() + "\n");

            veiculoMaisAntigo.acelerar();
        } else {
            System.out.println("Nenhum veículo na lista.");
        }
    }
}


