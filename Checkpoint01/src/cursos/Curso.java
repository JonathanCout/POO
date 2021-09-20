package cursos;

import pessoas.Aluno;
import pessoas.Professor;

import java.util.List;

public class Curso {
    private String nome;
    private Turno turno;
    private int preco;
    private boolean confirmado;
    private String sala;
    private List<Aluno> alunos;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
        gerarMatriculas();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void gerarMatriculas() {
        for (int i = 1; i <= alunos.size(); i++) {
            alunos.get(i - 1).setNumeroDeMatricula(i);
        }
    }
}
