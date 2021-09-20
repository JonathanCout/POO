import cursos.Curso;
import cursos.Turno;
import pessoas.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        /* Geração de um aluno */
        Aluno jonathan = new Aluno();

        jonathan.setCpf("150.114.547-97");
        jonathan.setEmail("coutinho@gmail.com");
        jonathan.setGenero(Genero.MASCULINO);
        jonathan.setNome("Jonathan");
        jonathan.setTelefone("21 975841567");

        jonathan.setEndereco(new Endereco());
        jonathan.getEndereco().setCidade("Rio de Janeiro");
        jonathan.getEndereco().setCep("21931-610");
        jonathan.getEndereco().setBairro("Ilha do Governador");
        jonathan.getEndereco().setLogradouro("Rua Combu");
        jonathan.getEndereco().setNumero("267");
        jonathan.getEndereco().setEstado("RJ");


        /* Lista de alunos a ser adicionada em um dos cursos */
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(jonathan);

        /* Geração de um professor */
        Professor carla = new Professor();
        carla.setFormacao(Formacao.DOUTORADO);
        carla.setValor_hora(3000);


        carla.setTelefone("21 941537894");
        carla.setNome("Carla dos Santos");
        carla.setGenero(Genero.FEMININO);
        carla.setEmail("santoscarla@gmail.com");
        carla.setCpf("167.175.789-45");

        carla.setEndereco(new Endereco());
        carla.getEndereco().setCidade("Rio de Janeiro");
        carla.getEndereco().setCep("21931-246");
        carla.getEndereco().setBairro("Ilha do Governador");
        carla.getEndereco().setLogradouro("Rua Arriba");
        carla.getEndereco().setNumero("25");
        carla.getEndereco().setEstado("RJ");

        /* Define os valores das propriedades do curso */
        curso.setNome("INGLES");
        curso.setTurno(Turno.NOITE);
        curso.setPreco(5000);
        curso.setConfirmado(true);
        curso.setAlunos(alunos);
        curso.setProfessor(carla);
        curso.setSala("AB-02");


        System.out.println(curso.getNome());
        System.out.println(curso.isConfirmado());
        System.out.println(curso.getProfessor().getNome());
    }
}