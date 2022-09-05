package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Emprestimo{
    private String estudante; // sempre encapsular os atributos
    private String funcionario;
    private String livro; 
    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;
    
    // ----
    public Emprestimo(String estudante, String funcionario, String livro, LocalDate dtEmprestimo,
            LocalDate dtDevolucao) {
        this.estudante = estudante;
        this.funcionario = funcionario;
        this.livro = livro;
        this.dtEmprestimo = dtEmprestimo;
        this.dtDevolucao = dtDevolucao;
    }

    // ---

    // public Emprestimo(String estudante2, String funcionario2, String livro2, LocalDate novaDataDev,
    //         LocalDate novaDataDev2) {
    // }

    // public Estudante getEstudante() {
    //     return this.estudante;
    // }

    // public void setEstudante(Estudante estudante) {
    //     this.estudante = estudante;
    // }

    // public Funcionario getFuncionario() {
    //     return this.funcionario;
    // }

    // public void setFuncionario(Funcionario funcionario) {
    //     this.funcionario = funcionario;
    // }

    // public Livro getLivro() {
    //     return this.livro;
    // }

    // public void setLivro(Livro livro) {
    //     this.livro = livro;
    // }

    public LocalDate getDtEmprestimo() {
        return this.dtEmprestimo;
    }

    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    public LocalDate getDtDevolucao() {
        return this.dtDevolucao;
    }

    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    @Override //sob escrita
    public String toString() {
            return ("Estudante:\t" + this.estudante + "\nFuncionario:\t" + this.funcionario + "\nLivro: \t" + this.livro
                + "\nData do emprestimo: \t" + this.dtEmprestimo + "\nData da devolução: \t" + this.dtDevolucao);
        // DaterTimeFormatter
    }
    
    // Realizar emprestimo
    public static Emprestimo realizaEmprestimo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o RA do estudante: ");
        String estudante1 = in.next();
        if (estudante1.length() < 6) {
            System.out.println("O RA deve ter pelo menos 6 caracteres!");
            return null;
        }
        System.out.print("Digite o titulo do livro: ");
        String livro1 = in.next();

        System.out.print("Digite o nome do funcionarioque esta realizando o emprestimo: ");
        String funcionario1 = in.next();

        System.out.print("Digite a data de Emprestimo do livro (dd/MM/yyyy): ");
        String dtEmprestimo = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataEmp = LocalDate.parse(dtEmprestimo, formatter);
        
        System.out.print("Digite a data da devolução do livro (dd/MM/yyyy): ");
        String dtDevolucao = in.next();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataDev = LocalDate.parse(dtDevolucao, formatter2);
        
        Emprestimo novoEmprestimoRealizado = new Emprestimo(estudante1, funcionario1, livro1, novaDataDev, novaDataDev);
        
        novoEmprestimoRealizado.setDtEmprestimo(novaDataEmp);
        novoEmprestimoRealizado.setDtDevolucao(novaDataDev);

        return novoEmprestimoRealizado;

    }

    // =======================================================================================================================================
    // Receber emprestimo

    public static Emprestimo receberDevolucao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o RA do estudante: ");
        String estudante1 = in.next();
        if (estudante1.length() < 6) {
            System.out.println("O RA deve ter pelo menos 6 caracteres!");
            return null;
        }
        System.out.print("Digite o titulo do livro: ");
        String livro1 = in.next();

        System.out.print("Digite o nome do funcionarioque esta recebendo a devolução: ");
        String funcionario1 = in.next();

        System.out.print("Digite a data da devolução do livro (dd/MM/yyyy): ");
        String dtDevolucao = in.next();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataDev = LocalDate.parse(dtDevolucao, formatter2);
        
        System.out.print("Digite a data de Emprestimo do livro (dd/MM/yyyy): ");
        String dtEmprestimo = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataEmp = LocalDate.parse(dtEmprestimo, formatter);
        
        
        Emprestimo novoEmprestimoRecebido = new Emprestimo(estudante1, funcionario1, livro1, novaDataDev, novaDataDev);
        
        novoEmprestimoRecebido.setDtDevolucao(novaDataDev);
        novoEmprestimoRecebido.setDtEmprestimo(novaDataEmp);

        return novoEmprestimoRecebido;

    }

    

}
