import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Tudo bem? Seja bem-vindo!");
        System.out.println("O objetivo desse código é mostrar a você a qual classe de personagem escolher.");


        System.out.println("Digite a quantidade de jogadores: ");


        while (!input.hasNextInt()){
            mensagem_erro.mostrar();
            System.out.println("Digite a quantidade de jogadores: ");
            input.next();
        }


        int jogadores = input.nextInt();

        if (jogadores > 0){
            Personagem player[] = new Personagem[jogadores];

            for (int i=0; i<jogadores; i++){

                System.out.println("Jogador "+ (i+1) );
                player[i] = new Personagem();

                player[i].jogador(input);
                player[i].escolha_personagem(input);

            }
        }
        else
        {
            System.out.println("ERRO! Não foi possível inserir a quantidade de jogadores!");
        }
    }
}