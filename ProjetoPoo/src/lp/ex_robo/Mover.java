package ProjetoPoo.src.lp.ex_robo;

import java.io.IOException;
import java.util.Scanner;

public class Mover {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int adicionar = 0;
        int op = 1;
        
        System.out.print("\n\n++ROBO++ ");
        System.out.print("\n\nDigite a posição inicial do robô x : ");
         x = in.nextInt();
         
        System.out.print("\nDigite a posição inicial do robô y : ");
         y = in.nextInt();
        Robo robo = new Robo(x,y);
    
    do{
        
        System.out.println(" ------------------------------------------");
        System.out.println("|    +++ Sistema para mover o Robo +++     |");
        System.out.println("|------------------------------------------|");
        System.out.println("|            Escolha uma direção           |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("|   1 - Mover-se para cima                 |");
        System.out.println("|   2 - Mover-se para direita              |");
        System.out.println("|   3 - Mover-se para baixo                |");
        System.out.println("|   4 - Mover-se para esquerda             |");
        System.out.println("|   0 - Sair                               |");
        System.out.println("|                                          |");
        System.out.println(" ------------------------------------------");
        System.out.println("  Digite aqui sua movimentação:                                                             |");
        op = in.nextInt();
        
        if(op != 0){
            System.out.println("\nDigite quantos passos queira movimentar-se nessa direção: ");
            adicionar = in.nextInt();
        }

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
        
            System.out.println("\nPosição atual do robô (x,y):(" + robo.getX() + ")(" + robo.getY() + ")");


        }while
            (op !=5); 
    }
}

