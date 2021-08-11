import java.util.Scanner;
// A biblioteca scanner serve para usarmos valores digitados no console
public class MinhaClasse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = sc.next();
        System.out.println("Insira seu sobrenome:");
        String sobrenome = sc.next();
        String iniciais = "" + nome.charAt(0) + sobrenome.charAt(0);


        System.out.println("Insira o seu dia de nascimento:");
        String diaNasc = sc.next();

        System.out.println("Insira seu mês de nascimento:");
        String mesNasc = sc.next();

        System.out.println("Insira seu ano de nascimento:");
        String anoNasc = sc.next();

        System.out.println(String.format("Seja bem vindo! Seus dados principais: \n Nome Completo: %s %s \n Inciais: " +
                "%s \n Data de nascimento: %s" ,nome,sobrenome,iniciais,dataFormatada(diaNasc,mesNasc,anoNasc)));
    }
    public static String dataFormatada (String dia,String mes, String ano) {
        return String.format("%s/%s/%s",dia,mes,ano);
    }
}
