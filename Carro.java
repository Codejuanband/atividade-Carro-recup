public class Carro {

    // atributos
    // public

    private String modelo;
    private Integer placa;
    private Integer ano;
    private Double velocidade;
    private Double qntCombustivel;
    private Double maxCombustivel;
    // metodos

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer novaPlaca) {
        this.placa = novaPlaca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer novoAno) {
        this.ano = novoAno;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double novaVelocidade) {
        this.velocidade = novaVelocidade;
    }

    public Double getQntCombustivel() {
        return qntCombustivel;
    }

    public void setQntCombustivel(Double novoQntCombustivel) {
        this.qntCombustivel = novoQntCombustivel;

    }

    public Double getMaxCombustivel() {
        return maxCombustivel;
    }

    public void setMaxCombustivel(Double novoMaxCombustivel) {
        this.maxCombustivel = novoMaxCombustivel;
    }

    void Acelerar(Double velocidade, Double combustivel) {
        if (velocidade < 150 && combustivel > 0) {
            velocidade = velocidade + velocidade * 0.1;
            combustivel = combustivel - combustivel * 0.01;
        } else {
            System.out.println("ERRO BOLADO");
        }
    }

    void Freiar(Double velocidade) {
        if (velocidade > 0) {
            velocidade = velocidade - velocidade * 0.1;
        } else {
            System.out.println("ERRO BOLADO 2");
        }
    }

    void abastece(Double combustivel, Double maxCombustivel, double abastecer) {
        if (maxCombustivel > combustivel + abastecer) {
            combustivel = combustivel + abastecer;
        }
    }

    public String toString() {
        return "Carro [modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", velocidade=" + velocidade
                + ", qntCombustivel=" + qntCombustivel + ", maxCombustivel=" + maxCombustivel + "]";
    }
    
}
