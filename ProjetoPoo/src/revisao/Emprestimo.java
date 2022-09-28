package ProjetoPoo.src.revisao;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Funcionario func;
    private Estudante estudante;
    private LocalDate dtEmprestimo; 
    private LocalDate dtDevolucao;

    private final int DIAS_EMPRESTIMO = 5;

    public Emprestimo(Livro _livro, Funcionario _func, Estudante _estudante) {
        this.livro = _livro;
        this.func = _func;
        this.estudante = _estudante;
        this.dtEmprestimo = LocalDate.now();// data atual que foi criado o obj
        this.dtDevolucao = this.dtEmprestimo.plusDays(DIAS_EMPRESTIMO);
    }

    public void devolverLivro() {

    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return this.func;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.func = funcionario;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

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

}
