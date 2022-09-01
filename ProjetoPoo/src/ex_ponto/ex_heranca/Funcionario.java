package ProjetoPoo.src.ex_ponto.ex_heranca;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String matricula;
    private LocalDate dtAdmissao;
    private String cargo;

     public Funcionario(String nome, LocalDate dtNascimento, String endereco, String formacao) {
       super(nome, dtNascimento, endereco);
        this.nome = nome;
        this.dtNascimento = dtNascimento; 
    }//colocar super em todos

    // ----
    public Funcionario(String matricula) {
        this.matricula = matricula;
    }
    // --- 
     
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDtAdmissao() {
        return this.dtAdmissao;
    }

    public void setDtAdmissao(LocalDate dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }    

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return ("Matrícula: " + this.matricula + "\nCargo: " + this.cargo + "\nData de Admissão: " + this.dtAdmissao );
    }

    public static Funcionario cadastrarFunc() {
        Scanner in = new Scanner(System.in);
        
        //matricula
        System.out.print("Digite a matrícula do funcioário: ");
        String matricula = in.next();
        if (matricula.length() < 6){ 
            System.out.println("A matrícula deve ter pelo menos 6 caracteres!");
            return null;
        }
        Funcionario novoFunc = new Funcionario(matricula);

        //cargo
        System.out.print("Digite o cargo do funcionário: ");
        novoFunc.setCargo(in.next());

        //data
        System.out.print("Digite a data de Admissão (dd/mm/yyyy): ");
        String data = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaData = LocalDate.parse(data, formatter);
        
        // System.out.println("Nova data = " + novaData.format(formatter));

        novoFunc.setDtAdmissao(novaData);

        return novoFunc;

    }

}
