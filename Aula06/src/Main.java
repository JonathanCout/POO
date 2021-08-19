import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Impressora impressora1 = new Impressora("Epson", "wifi",LocalDate.of(2014,9,15),2);
        impressora1.print("Ta imprimindo");
        impressora1.print("A folha vai acabar...");
        System.out.println(impressora1.getFolhasDisponiveis());
        impressora1.print("hmm...");
        impressora1.colocarPapel(5);
        impressora1.print("Será que tem folha agora?");
        impressora1.print("Ih rapaz, tem folha mesmo!!!");

        System.out.println(impressora1.getModelo());
        System.out.println(impressora1.getTipoConexao());
        System.out.println(impressora1.getDataFabricacao());
    }
}
