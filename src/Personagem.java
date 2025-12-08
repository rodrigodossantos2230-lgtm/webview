import java.util.Scanner;



public class Personagem {

    //Características do jogador
    private String nome;
    private int idade;


    public void jogador (Scanner entrada){
        System.out.println("Qual é o seu nome? ");
        this.nome = entrada.next();

        System.out.println("Digite sua idade: ");

        /*Enquanto o valor da entrada não for um valor inteiro,
        não será possível inserir o valor da idade.*/

        while (!entrada.hasNextInt()){
            mensagem_erro.mostrar();
            System.out.println("Digite sua idade: ");
            entrada.next();
        }

        this.idade = entrada.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }



    public void escolha_personagem(Scanner entrada){

        seleção.mostrar();

        while (!entrada.hasNextInt()){
            mensagem_erro.mostrar();
            seleção.mostrar();
            entrada.next();
        }


        int escolha = entrada.nextInt();


        classe_personagem classe = classe_personagem.criar(escolha);

        if (classe != null){
            System.out.println("Muito bem, " + nome + "! Boa escolha.");
            classe.mostrar();
        }
        else {
            System.out.println("ERRO! Opção Inválida!");
        }
    }

}



class seleção{
    public static void mostrar() {
        System.out.println("Escolha a sua classe!");
        System.out.println("1 - Assassino");
        System.out.println("2 - Tanque");
        System.out.println("3 - Suporte");
    }
}



class classe_personagem{

    //Criação de atributos privados. Pois, cada personagem terá seu próprio valor.
    private int vida;
    private int ataque;
    private int defesa;
    private float velocidade;
    private String nomeClasse;


    /*  Atribuição dos atributos para cada classe de personagem.
        Logo abaixo, é criado um "CONSTRUTOR". Pois não terá a
        necessidade de ficar criando vários métodos e não ficar um código grande.
    */

    public classe_personagem(String nomeClasse, int vida, int ataque, int defesa, int velocidade){
        this.nomeClasse = nomeClasse;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }


    public static classe_personagem criar(int opção){ //
        switch (opção){

            case 1:
                return new classe_personagem("Assasino", 1800, 600, 20, 34);

            case 2:
                return new classe_personagem("Tanque", 3800, 100, 80, 12);

            case 3:
                return new classe_personagem("Suporte", 2400, 300, 50, 24);

            default:
                return null;
        }
    }


    public void mostrar(){
        System.out.println("Classe escolhida: "+nomeClasse);
        System.out.println("HP: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa + "%");
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}



class mensagem_erro{
    public static void mostrar(){
        System.out.println("ERRO! Insira um valor numérico para escolher!");
    }
}