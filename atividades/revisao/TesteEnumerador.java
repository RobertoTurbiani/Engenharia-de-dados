package school.sptech.revisao;

public class TesteEnumerador {
    public static void main(String[] args) {

        DiaDaSemana hoje = DiaDaSemana.TERCA;

        System.out.println(hoje);

        System.out.println("O número de hoje é: " + hoje.getNumeroDoDIa());

        switch (hoje) {
            case SEGUNDA -> System.out.println("Hoje é segunda!!!!");
            case TERCA -> System.out.println("AULA DE ED!!!!");
        }
    }
}
