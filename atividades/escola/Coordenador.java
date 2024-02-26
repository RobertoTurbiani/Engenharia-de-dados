package school.sptech.escola;

public class Coordenador implements IBonus {
    private String nome;
    private Integer qtdHoraCoordenacao;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Integer qtdHoraCoordenacao, Double valorHoraCoordenacao) {
        this.nome = nome;
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorBonus() {

        Double bonus = (qtdHoraCoordenacao * valorHoraCoordenacao * 4.5) * 0.2;
        return bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoraCoordenacao() {
        return qtdHoraCoordenacao;
    }

    public void setQtdHoraCoordenacao(Integer qtdHoraCoordenacao) {
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Quantidade de horas de coordenação: %d
                Valor por hora: %.2f
                """.formatted(nome,qtdHoraCoordenacao,valorHoraCoordenacao);
    }
}
