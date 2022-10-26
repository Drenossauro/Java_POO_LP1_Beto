package ProjetoPoo.src.lp.ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InitOrdenacao {

    public static void main(String[] args) {

        // Fazer a leitura pelo teclado
        Scanner in = new Scanner(System.in);
        // classe nome_objeto = comando -contrutor da clsse (parametro para leitura)

        // Declaração dos vetores e matrizes JAVA
        int vetor[] = new int[5];

        int vetor2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int matriz[][] = new int[3][3];

        // vetor[2] = 30;
        // vetor2[0] = 10;
        // matriz[0][0] = 1;

        // for (int i = 0; i < 5; i++) {
        // System.out.println(vetor[i]);

        // }

        // for(int i = 0; i < 5; i++) {
        // System.out.println("Digite o # " + (i + 1) + " = " + " número");
        // vetor[i] = in.nextInt();

        // }
        // -----------------------------------------------------------------\\---------------------------------\\
        // int num = 1 + ((int) (Math.random()) * 10);

        // Random

        int min = 2, max = 10;
        Random rand = new Random();
        // System.out.println(rand.nextInt(max - min) + min);

        // ERRO
        // for (int i = 0; i < 5; i++) {

        // System.out.println("vetor[" + i + "] = " + rand.nextInt(max - min) + min );

        // }

        // CERTO

        System.out.println("\nVetor: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = rand.nextInt(max - min) + min;
            System.out.println("[" + i + "] = " + vetor[i]);
        }

        System.out.println("\nVetor2: ");
        for (int i = 0; i < 8; i++) {
            vetor2[i] = rand.nextInt(max - min) + min;
            System.out.println("[" + i + "] = " + vetor2[i]);
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(max - min) + min;
                System.out.println("[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
