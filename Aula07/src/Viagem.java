import java.util.ArrayList;
import java.util.List;

public class Viagem {
    public static void main(String[] args) {
        Passageiro gleyson = new Passageiro();
        gleyson.setCpf("868767868");
        gleyson.setNome("GLEYSON SAMPAIO");

        Endereco origem = new Endereco();
        origem.setBairro("CENTRO");
        origem.setCidade("SAO PAULO");
        origem.setLogradouro("RUA 13 DE MAIO");
        origem.setUf("SP");
        origem.setNumero("351");

        gleyson.setOrigem(origem);

        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        Telefone telefone = new Telefone(11,8755,TelefoneTipo.FIXO);
        Telefone whats = new Telefone(11,8755,TelefoneTipo.WHATSAPP);

        telefones.add(telefone);
        telefones.add(whats);

        gleyson.setTelefones(telefones);

        Endereco destino = new Endereco();
        destino.setBairro("ZONA SUL");
        destino.setCidade("RIO DE JANEIRO");
        destino.setLogradouro("AV MORUMBI");
        destino.setUf("RJ");
        destino.setNumero("4545");

        ArrayList<Endereco> destinos = new ArrayList<Endereco>();
        destinos.add(destino);

        gleyson.setDestinos(destinos);

        System.out.println("FIM");

    }
}
