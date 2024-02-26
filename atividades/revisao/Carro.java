package school.sptech.revisao;

public class Carro {

  private String marca;
  private String placa;
  private Double valor;
  private Integer ano;

    public Carro(String marca, String placa, Double valor, Integer ano) {
        this.marca = marca;
        this.placa = placa;
        this.valor = valor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
