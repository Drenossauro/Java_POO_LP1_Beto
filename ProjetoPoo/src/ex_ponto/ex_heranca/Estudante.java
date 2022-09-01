package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;


public class Estudante extends Pessoa {
    private String ra;
    private String curso;
    private LocalDate dtInicio; // quando iniciou o curso

     // ----
     public Estudante(String ra) {
        this.ra = ra;
    }  
    // ---

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    @Override
    public String toString() {
        return ("Ra: " + this.ra + "\nCurso: " + this.curso + "\nData de Inicio: " + this.dtInicio);
    }

   
    public static Estudante cadastrarEstudante() {
        Scanner in = new Scanner(System.in);
         
        //ra
        System.out.print("Digite o RA do estudante: ");
        String ra = in.next();
        if (ra.length() < 6){ 
            System.out.println("O RA deve ter pelo menos 6 caracteres!");
            return null;
        }
        Estudante novoEstudante = new Estudante(ra);

        //curso
        System.out.print("Digite o curso do Estudante: ");
        novoEstudante.setCurso(in.next());

        //data 
        System.out.print("Digite a data de Inicio do curso (dd/mm/yyyy): ");
        String data = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaData = LocalDate.parse(data, formatter);
        // System.out.println("Nova data = " + novaData.format(formatter));
        novoEstudante.setDtInicio(novaData);


        return novoEstudante;

    }

}