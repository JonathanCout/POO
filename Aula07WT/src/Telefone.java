public class Telefone {
    private int ddd;
    private int numero;
    private TelefoneTipo tipo;

    public Telefone(int ddd, int numero, TelefoneTipo tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getDdd() {
        return ddd;
    }

    public int getNumero() {
        return numero;
    }

    public TelefoneTipo getTipo() {
        return tipo;
    }
}
