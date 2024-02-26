package school.sptech.revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploStream {

    public static void main(String[] args) {
        //Exemplos Stream API em Java
        List<Carro> carros = Arrays.asList(
                new Carro("Fiat","123",30_000.50,2009),
                new Carro("BMW","222",120_000.50,1999),
                new Carro("BMW","444",20_000.50,2023),
                new Carro("BYD","555",130_000.50,2019)
        );

        carros.stream().forEach(carro -> {
            System.out.println(carro);
        });

       List<Carro> carrosDaBmw =  carros.stream().filter(carro -> carro.getMarca().equals("BMW")).toList();

       List<String> placas = carros.stream().map(carro -> carro.getPlaca()).toList();

       List<String> placasDeBmw = carros.stream().filter
               (carro -> carro.getMarca().equals("BMW"))
               .map(carro -> carro.getPlaca()).toList();

       Double valorTotalDeCarros = carros.stream().mapToDouble(Carro::getValor).sum();
    }
}