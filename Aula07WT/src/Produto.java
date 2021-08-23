
public class Produto {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private double preco;

    public Produto(String modelo, String marca, int anoFabricacao, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getDataFabricacao() {
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }
}
