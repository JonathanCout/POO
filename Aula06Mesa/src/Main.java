public class Main {
    public static void main(String[] args) {
        Cachorro teddy = new Cachorro(true, "Poodle",2016,10, true, false, "Teddy");
        Cachorro thor = new Cachorro(true,"Vira-lata",2018,15,false,true,"Thor");
        Cachorro luna = new Cachorro(true, "SRD",2021, 3.5, false, false, "Luna");
        // Primeiro animal pode ser adotado, segundo não pode por estar ferido, terceiro não pode pelo peso
        teddy.informacoes();
//        thor.informacoes();
//        luna.informacoes();
    }
        }
