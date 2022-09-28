package ProjetoPoo.src.revisao;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ProjetoPoo.src.ex_ponto.ex_heranca.Pessoa;

public class Funcionario extends Pessoa {
    private String matricula;
    private boolean status;

    public Funcionario(String _nome,String _matricula){
        this.nome = _nome;
        this.matricula = _matricula;
    }

    // GET e SET

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String isStatus() {
        //if(this.status) return "Ativo"; else return "Inativo";
        return this.status ? "Ativo" : "Inativo";
    }

    // public boolean getStatus() {
    //     return this.status;
    // }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula +
            "\nStatus: " + this.status + "\nData de nascimento: " + this.dtNascimento.format(f);
    }


    public static Funcionario lerFuncionario(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario:");
        String nome = in.nextLine();

        System.out.print("Digite a matricula do funcionario:");
        String matricula = in.nextLine();

        Funcionario objFuncionario = new Funcionario(matricula,nome);

        return objFuncionario;
    }


}
