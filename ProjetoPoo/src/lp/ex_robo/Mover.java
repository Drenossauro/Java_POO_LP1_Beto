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
        Robo robo = new Robo(0, 0);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Posição atual (x,y):(" + robo.getX() + "),(" + robo.getY() + ")");
        
        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.print("Digite Aqui: ");
            op = in.nextInt();
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
    
    int adicionar = 0;
    private static void escolha(int op) {
        switch (op) {
            case 1:
                robo.top(adicionar);
                break;
            case 2:
                robo.right(adicionar);
                break;
            case 3:
                robo.down(adicionar);
                break;
            case 4:
                robo.left(adicionar);
                break;
            case 0:
                System.out.println("Posição atual (x,y):(" + robo.getX() + "),(" + robo.getY() + ")");
                break;
            default:
                System.out.println("Saindo da função escolha");
                break;
            }
        }
    }

