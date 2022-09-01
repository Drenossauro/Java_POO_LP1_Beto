package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome; //protected na super class
    protected LocalDate dtNascimento;
    protected String endereco;

    //esse construtor so existe para poder gerar instancia em estudante e funcionario
    protected Pessoa(){}

    //contrutor obrigatorio
    protected Pessoa(String _nome, LocalDate _dtNascimento, String _endereco){
        this.nome = _nome;
        this.dtNascimento = _dtNascimento;
        this.endereco = _endereco;
    } 

    


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(LocalDate dt_nascimento) {
        this.dtNascimento = dt_nascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 


}
