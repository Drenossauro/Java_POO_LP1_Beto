package ProjetoPoo.src.revisao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ProjetoPoo.src.ex_ponto.ex_heranca.Pessoa;

public class Autor extends Pessoa {
    private int qto;
    private String area;

    public Autor(String _nome, LocalDate _dtNascimento, int _qto, String _area) {
        this.nome = _nome;
        this.dtNascimento = _dtNascimento;
        this.qto = _qto;
        this.area = _area;
    }

    // GET e SET 

    public int getQto() {
        return this.qto;
    }

    public void setQto(int qto) {
        this.qto = qto;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome + "\nData de nascimento: " + this.dtNascimento.format(f) + "\nQuantidade de Livros: " + this.qto + "\nArea: " + this.area;
    }

    public static Autor lerAutor(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do Autor: ");
        String nome = in.nextLine();

        System.out.print("Digite a data de Nascimento do Autor: ");
        String dtNascimento = in.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //LocalDate dtNascimento = LocalDate.parse(dtNascimento, formatter);
        // System.out.println("Nova data = " + novaData.format(formatter));

        // objAutor.setDtNascimento(dtNascimento);

        System.out.print("Digite o numero de livros: ");
        int qto = in.nextInt();

        System.out.print("Digite a area do Autor: ");
        String area = in.nextLine();
        
        Autor objAutor = new Autor(nome,dtNascimento,qto,area);

        return objAutor;

    }

}


