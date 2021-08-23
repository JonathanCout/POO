import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    public static void main(String[] args) {
        // Necessário criar uma função geradora de código único
        int codigo = 3;

        // Criar cliente que fez o pedido
        Cliente cliente = new Cliente();
        cliente.setNome("Jhon");

        // Setar seu endereço
        Endereco entrega = new Endereco();
        entrega.setBairro("Centro");
        entrega.setLogradouro("Rua Rio Branco");
        entrega.setCidade("Rio de Janeiro");
        entrega.setNumero("2650, sala 204");
        entrega.setUf("RJ");

        cliente.setEndereco(entrega);

        // Setar seus telefones de contato
        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        Telefone fixo = new Telefone(21, 33631958, TelefoneTipo.FIXO);
        Telefone celular = new Telefone(21, 978513256, TelefoneTipo.CELULAR);
        Telefone whats = new Telefone(21, 981546723, TelefoneTipo.WHATSAPP);

        telefones.add(fixo);
        telefones.add(celular);
        telefones.add(whats);

        cliente.setTelefones(telefones);

        // Criar carrinho de produtos
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        Produto geladeira = new Produto("BTP567", "Brastemp", 2015,3000);
        Produto xbox = new Produto("One", "Microsoft", 2016,2980);

        carrinho.add(geladeira);
        carrinho.add(xbox);

        // Sout somente para debug
        System.out.println("Fim");
    }
}
