public class Main {
    public static void main(String[] args) {
        UsuarioJogo user1 = new UsuarioJogo("Letícia", "letiX");
        UsuarioJogo user2 = new UsuarioJogo("Amanda", "mandaBear");

        user1.setPontos(200);
        user1.Bonus(300);
        user1.setNivel();
        user1.setNivel();

        user2.setPontos(150);
        user2.setNivel();
        user2.setNick("mandabear");

        System.out.printf("Nome de usuário: %s \n Nickname: %s \n Nível: %s \n Pontuação Total: %s",
                user1.getNome(),user1.getNick(),user1.getNivel(),user1.getPontos());

        System.out.printf("Nome de usuário: %s \n Nickname: %s \n Nível: %s \n Pontuação Total: %s",
                user2.getNome(),user2.getNick(),user2.getNivel(),user2.getPontos());
    }
}
