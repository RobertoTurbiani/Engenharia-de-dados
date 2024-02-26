package school.sptech.revisao;

public enum DiaDaSemana {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5);
    private final Integer numeroDoDIa;
    DiaDaSemana(Integer numeroDoDIa) {
        this.numeroDoDIa = numeroDoDIa;
    }

    public Integer getNumeroDoDIa() {
        return numeroDoDIa;
    }
}
