import java.time.LocalDate;

public class Impressora {

    private final String modelo;
    private  String tipoConexao;
    private final LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temFolha () {
        return folhasDisponiveis != 0;
    }

    private void usarFolha() {
       setFolhasDisponiveis(this.folhasDisponiveis - 1);
    }

    public void colocarPapel (int pap) {
        setFolhasDisponiveis(this.folhasDisponiveis + pap);
    }

    public void print (String texto) {
        if (temFolha()) {
            System.out.println(texto);
            usarFolha();
        } else {
            System.out.println("Sem folha disponível, adicionar mais!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

}
