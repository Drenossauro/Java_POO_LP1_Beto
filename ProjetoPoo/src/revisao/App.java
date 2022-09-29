package ProjetoPoo.src.revisao;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Estudante objEstudante = new Estudante("201202120","Beto");
        // objEstudante.setCurso("TADS");
        // objEstudante.setDtNascimento(LocalDate.of(2020, 5, 1));
        // System.out.println(objEstudante);

        // // 'Funcionario func1 = new Funcionario("","");

        // Autor objAutor = new Autor();
        // objAutor.setNome("leticia");
        // objAutor.setArea("TADS");

        // Livro objLivro = new Livro();
        // objLivro.setTitulo("POO");
        // objLivro.setAnoLancamento(2022);
        // objLivro.setEditora("LIVRAA");
        // objLivro.setNpag(203);
        // objLivro.setAutor(objAutor);
        
        // Funcionario objfuncionario = new Funcionario("202012121021","Andre");

        // Emprestimo novoEmprestimo = new Emprestimo(
        //     objLivro,
        //     objFuncionario,
        //     objAutor,

        // );

        Scanner in = new Scanner(System.in);

        Funcionario objfuncionario = Funcionario.lerFuncionario();
        System.out.println(objfuncionario.getNome() + "\n " + objfuncionario.getMatricula());

    }
}
