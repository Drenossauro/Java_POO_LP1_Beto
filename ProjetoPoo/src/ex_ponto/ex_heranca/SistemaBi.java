package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class SistemaBi {
    private final static String[] opcoes = {
            "\n\n",
            " -----------------------------------------------------------------",
            "|                  +++ Sistema biblioteca +++                     |",
            "|-----------------------------------------------------------------|",
            "|                      Escolha uma opção                          |",
            "|-----------------------------------------------------------------|",
            "|                                                                 |",
            "| 1 - Cadastrar Livro                                             |",
            "| 2 - Cadastrar Funcionario                                       |",
            "| 3 - Cadastrar Estudante                                         |",
            "| 4 - Cadastrar Autor                                             |",
            "| 5 - Realizar Emprestimo                                         |",
            "| 6 - Receber Emprestimo                                          |",
            "| 0 - Sair                                                        |",
            "|                                                                 |",
            " -----------------------------------------------------------------",
            
    };

    private static List<Livro> livros = new ArrayList<Livro>();
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static List<Estudante> estudantes = new ArrayList<Estudante>();
    private static List<Autor> autores = new ArrayList<Autor>();
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private static List<Emprestimo> devolucoes = new ArrayList<Emprestimo>();

    private static Scanner buffer = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {
        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.print("Digite Aqui: ");
            op = buffer.nextInt();
            escolha(op);
            System.in.read();// System("pause")
        }

    }

    // ====================================================================================
    
    private static void printMenu() {
        System.out.print("\033[H\033[2j");
        System.out.flush();
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    // =====================================================================================
    
    private static void escolha(int op) {
        switch (op) {
            // cadastrar Livro 
            case 1:
                System.out.println("\n + Cadastrando Livro + \n");
                Livro novoLivro = Livro.cadastrarLivro();
                System.out.println("\nLivro cadastrado!\n\nResumo...");
                System.out.println(novoLivro.toString());
                livros.add(novoLivro);
                break;

            // cadastrar funcionario
            case 2:
                System.out.println("\n + Cadastrando Funcionário + \n");
                Funcionario novoFunc = Funcionario.cadastrarFunc();
                System.out.println("\nNovo funcionário cadastrado!\n\nResumo...");
                System.out.println(novoFunc.toString());
                funcionarios.add(novoFunc);
                break;

            // cadastrar Estudante
            case 3:
                System.out.println("\n + Cadastrando Estudante + \n");
                Estudante novoEstudante = Estudante.cadastrarEstudante();
                System.out.println("\nNovo estudante cadastrado!\n\nResumo...");
                System.out.println(novoEstudante.toString());
                estudantes.add(novoEstudante);
                break;

            // cadastrar Autor
            case 4:
                System.out.println("\n + Cadastrando Autor + \n");
                Autor novoAutor = Autor.cadastrarAutor();
                System.out.println("\nNovo autor cadastrado!\n\nResumo...");
                System.out.println(novoAutor.toString());
                autores.add(novoAutor);
                break;

            // Realizar emprestimo
            case 5:
                System.out.println("\n + Realizando Emprestimo + \n");
                Emprestimo novoEmprestimoRealizado = Emprestimo.realizaEmprestimo();
                System.out.println("Emprestimo realizado!\n\nResumo...");
                System.out.println(novoEmprestimoRealizado.toString());
                emprestimos.add(novoEmprestimoRealizado);
                break;

            //Receber devolução
            case 6:
                System.out.println("\n + Realizando Devolição + \n");
                Emprestimo novoEmprestimoRecebido = Emprestimo.receberDevolucao();
                System.out.println("Devolução recebida!\n\nResumo...");
                System.out.println(novoEmprestimoRecebido.toString());
                devolucoes.add(novoEmprestimoRecebido);
                break;

            case 0:
                System.out.println("\nAté mais usuário\n");
                System.exit(0);

            default:
                System.out.println("Saindo da função escolha");
                break;

        }
    }
}
