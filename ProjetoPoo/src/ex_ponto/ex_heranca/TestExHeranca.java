// package ProjetoPoo.src.ex_ponto.ex_heranca;

// import java.time.LocalDate;
// import java.time.Month;

// public class TestExHeranca {
    
//     public static void main(String[] args) {

//         LocalDate dtNascimento = LocalDate.of(2022, Month.JULY, 15);
//         Autor beto = new Autor("Paulo", dtNascimento,"R:02", "Computação", 4);
        
//         //obejeto livro Poo
//         Livro livroPoo = new Livro("ProjetoPoo"); 
//         livroPoo.setEditora("Editora Erica");
//         LocalDate dataLancamentoPoo = LocalDate.of(2022, Month.APRIL, 1);
//         livroPoo.setDtLancamento(dataLancamentoPoo);

//         //objeto livro LP
//         Livro livroLP = new Livro("Progrmação");
//         livroLP.setEditora("Editora Lais");
//         LocalDate dataLancamentoLP = LocalDate.of(2022, Month.APRIL, 10);
//         livroLP.setDtLancamento(dataLancamentoLP);


//         //objeto funcionario
//         Funcionario func = new Funcionario();
//         func.setNome("Leticia");
//         func.setEndereco("R:0123");
//         LocalDate dtNascimentoLeticia = LocalDate.of(2001, Month.APRIL,12);
//         func.setDtNascimento(dtNascimentoLeticia);
//         LocalDate dtAdmissao = LocalDate.of(2022, Month.JULY,3);
//         func.setDtAdmissao(dtAdmissao);
//         func.setCargo("Programadora");
//         func.setMatricula("1298");

//         //objeto estudante
//         Estudante estudante1 = new Estudante();
//         estudante1.setNome("Paulo");
//         estudante1.setEndereco("R:23");
//         LocalDate dataNascEstudante1 = LocalDate.of(2002, Month.APRIL, 10);
//         estudante1.setDtNascimento(dataNascEstudante1);
//         estudante1.setRa("123");
//         estudante1.setCurso("Computação");
//         LocalDate dataInicio = LocalDate.of(2014, Month.APRIL, 25);
//         estudante1.setDtInicio(dataInicio);

//         //obleto Emprestimo

//         Emprestimo emprestimo1 = new Emprestimo();
//         emprestimo1.setEstudante(estudante1);
//         emprestimo1.setFuncionario(func);
//         emprestimo1.setLivro(livroPoo);
//         LocalDate dtEmprestimo = LocalDate.of(2022, Month.JANUARY, 10);
//         LocalDate dtDevolucao = LocalDate.of(2022, Month.JULY, 20);
//         emprestimo1.setDtDevolucao(dtDevolucao);
//         emprestimo1.setDtEmprestimo(dtEmprestimo);


//     }
// }
