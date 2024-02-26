package school.sptech.escola;

public class Professor implements IBonus {

    private String nome;
    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorBonus() {

        Double bonus = (qtdAulasSemana * valorHoraAula * 4.5) * 0.15;
        return bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAulasSemana() {
        return qtdAulasSemana;
    }

    public void setQtdAulasSemana(Integer qtdAulasSemana) {
        this.qtdAulasSemana = qtdAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Quantidade de aulas por semana: %d
                valor por hora: %.2f
                """.formatted(nome,qtdAulasSemana,valorHoraAula);
    }
}
