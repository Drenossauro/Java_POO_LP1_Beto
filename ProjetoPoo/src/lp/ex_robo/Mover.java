package ProjetoPoo.src.lp.ex_robo;

import java.io.IOException;
import java.util.Scanner;



public class Mover {
    private final static String[] opcoes = {
        "\n\n",
        " -----------------------------------------------------------------",
        "|               +++ Sistema para mover o Robo +++                 |",
        "|-----------------------------------------------------------------|",
        "|                      Escolha uma opção                          |",
        "|-----------------------------------------------------------------|",
        "|                                                                 |",
        "| 1 - Mover-se para cima                                          |",
        "| 2 - Mover-se para direita                                       |",
        "| 3 - Mover-se para baixo                                         |",
        "| 4 - Mover-se para esquerda                                      |",
        "| 0 - Sair                                                        |",
        "|                                                                 |",
        " -----------------------------------------------------------------",
        
};
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int adicionar = 0;

        System.out.print("Digite a posição inicial x: ");
            x = in.nextInt();
        System.out.print("\nDigite a posição inicial y: ");
            y = in.nextInt();

        Robo mover = new Robo(x,y);

        private static void buffer = new Scanner(System.in);


        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.print("Digite Aqui: ");
            op = buffer.nextInt();
            escolha(op);
            System.in.read();
        }
    }
        private static void printMenu() {
            System.out.print("\033[H\033[2j");
            System.out.flush();
            for (String op : opcoes) {
                System.out.println(op);
            }
        }

        private static void escolha(int op) {
            switch (op) {
                case 1:
                Robo.top(adicionar);
                break;
                case 1:
                Robo.top(adicionar);
                break;
                case 1:
                Robo.top(adicionar);
                break;
                case 1:
                Robo.top(adicionar);
                break;
                case 1:
                Robo.top(adicionar);
                break;
            }
        }

    }

