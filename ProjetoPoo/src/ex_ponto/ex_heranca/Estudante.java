package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        return ("Ra: \t" + this.ra + "\nCurso: \t" + this.curso + "\nData de Inicio: \t" + this.dtInicio);
    }

    public static Estudante cadastrarEstudante() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o RA do estudante: ");
        String ra = in.next();
        if (ra.length() < 6){ 
            System.out.println("O RA deve ter pelo menos 6 caracteres!");
            return null;
        }

        Estudante novoEstudante = new Estudante(ra);
        System.out.print("Digite o curso do Estudante: ");
        novoEstudante.setRa(in.next());

        System.out.print("Digite a data de Inicio do curso (dd/mm/yyyy): ");
        String data = in.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

        LocalDate novaData = LocalDate.parse(data, formatter);

        System.out.println("Nova data = " + novaData.format(formatter));

        novoEstudante.setDtInicio(novaData);
        return novoEstudante;

    }

}