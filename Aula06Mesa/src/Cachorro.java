import java.time.LocalDate;

public class Cachorro {
    boolean disponivel;
    String raca;
    int anoNascimento;
    int idade;
    double peso;
    boolean chip;
    boolean ferido;
    String nome;

    public Cachorro(boolean disponivel, String raca, int anoNascimento, double peso, boolean chip, boolean ferido, String nome) {
        this.disponivel = disponivel;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.nome = nome;
    }

    public Cachorro(String nome, int anoNascimento ,double peso) {
        this(false,"SRD",anoNascimento,peso,false,false,nome);
    }

    private boolean podePerder() {
        return !chip;
    }

    private void calcularIdade() {
        idade = 2021 - anoNascimento;
    }

    private boolean podeAdotar() {
        return !ferido && peso >=5;
    }

    public void informacoes() {
        if (podeAdotar()) {
            calcularIdade();
            System.out.printf("Nome do animal: %s \nIdade: %s anos \nPeso: %s Kg \nPode se perder: %s \nDisponível para adoção: %s",nome,idade,peso,podePerder(),disponivel);
        } else {
            System.out.printf("Infelizmente, o(a) animal %s não pode ser adotado", nome);
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isChip() {
        return chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public String getNome() {
        return nome;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }
}
