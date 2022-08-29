// package ProjetoPoo.src.ex_ponto.ex_heranca;

// import java.time.DateTimeException;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class Emprestimo {
//     private Estudante estudante; // sempre encapsular os atributos
//     private Funcionario funcionario;
//     private Livro livro;
//     private LocalDate dtEmprestimo;
//     private LocalDate dtDevolucao;

//     // ----
//     public Emprestimo(Estudante estudante, Funcionario funcionario, Livro livro, LocalDate dtEmprestimo,
//             LocalDate dtDevolucao) {
//         this.estudante = estudante;
//         this.funcionario = funcionario;
//         this.livro = livro;
//         this.dtEmprestimo = dtEmprestimo;
//         this.dtDevolucao = dtDevolucao;
//     }
//     // ---

//     public Estudante getEstudante() {
//         return this.estudante;
//     }

//     public void setEstudante(Estudante estudante) {
//         this.estudante = estudante;
//     }

//     public Funcionario getFuncionario() {
//         return this.funcionario;
//     }

//     public void setFuncionario(Funcionario funcionario) {
//         this.funcionario = funcionario;
//     }

//     public Livro getLivro() {
//         return this.livro;
//     }

//     public void setLivro(Livro livro) {
//         this.livro = livro;
//     }

//     public LocalDate getDtEmprestimo() {
//         return this.dtEmprestimo;
//     }

//     public void setDtEmprestimo(LocalDate dtEmprestimo) {
//         this.dtEmprestimo = dtEmprestimo;
//     }

//     public LocalDate getDtDevolucao() {
//         return this.dtDevolucao;
//     }

//     public void setDtDevolucao(LocalDate dtDevolucao) {
//         this.dtDevolucao = dtDevolucao;
//     }

//     @Override
//     public String toString() {
//         return ("Estudante:\t" + this.estudante + "\nFuncionario:\t" + this.funcionario + "\nLivro: \t" + this.livro
//                 + "\n Data do emprestimo: \t" + this.dtEmprestimo + "\nData da devolução: \t" + this.dtDevolucao);
//         // DaterTimeFormatter
//     }

//     // Realizar emprestimo
//     public static Emprestimo realizaEmprestimo() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Digite o RA do estudante: ");
//         String ra = in.next();
//         if (ra.length() < 6) {
//             System.out.println("O RA deve ter pelo menos 6 caracteres!");
//             return null;
//         }

//         Emprestimo novoEmprestimoRealizado = new Emprestimo(livro);
//         System.out.print("Digite o curso do Estudante: ");
//         novoEmprestimoRealizado.setDtEmprestimo(in.next());

//         System.out.print("Digite a data de Emprestimo (dd/mm/yyyy): ");
//         String data = in.next();

//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

//         LocalDate novaData = LocalDate.parse(data, formatter);

//         System.out.println("Nova data = " + novaData.format(formatter));

//         novoEmprestimoRealizado.setDtEmprestimo(novaData);
//         return novoEmprestimoRealizado;

//     }

//     // =======================================================================================================================================
//     // Receber emprestimo

//     public static Emprestimo receberDevolucao() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Digite o RA do estudante: ");
//         String ra = in.next();
//         if (ra.length() < 6) {
//             System.out.println("O RA deve ter pelo menos 6 caracteres!");
//             return null;
//         }

//         Emprestimo novoEmprestimoRecebido = new Emprestimo();
//         System.out.print("Digite o curso do Estudante: ");
//         novoEmprestimoRecebido.setDtDevolucao(in.next());

//         System.out.print("Digite a data de Devolução (dd/mm/yyyy): ");
//         String data = in.next();

//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

//         LocalDate novaData = LocalDate.parse(data, formatter);

//         System.out.println("Nova data = " + novaData.format(formatter));

//         novoEmprestimoRecebido.setDtEmprestimo(novaData);
//         return novoEmprestimoRecebido;

//     }

// }
