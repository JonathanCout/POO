public class UsuarioJogo {
    private final String nome;
    private String nick;
    private int pontos = 0;
    private int nivel = 1;
// Criação do objeo usuario
    public UsuarioJogo(String nome, String nick) {
        this.nome = nome;
        this.nick = nick;
    }
    // Méodos de criação de pontuação, nivel e bonus
    public void setPontos(int pontos) {
        this.pontos += pontos;
    }
    public void setNivel() {
        this.nivel++;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void Bonus (int bonus) {
        this.pontos += bonus;
    }
    // Métodos de captura dos dados do usuário
    public String getNome() {
        return nome;
    }
    public String getNick() {
        return nick;
    }
    public int getNivel() {
        return nivel;
    }
    public int getPontos() {
        return pontos;
    }

}
