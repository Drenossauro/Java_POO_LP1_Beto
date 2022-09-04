package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Autor extends Pessoa { 
    private String formacao;
    private int qtoLivros;//nunca armazenar isso


    public Autor(String nome, LocalDate dtNascimento, String endereco, String formacao, int qtoLivros) {
       super(nome, dtNascimento, endereco);
        this.formacao = formacao;
        this.qtoLivros = qtoLivros; 
    }
 
     // ----
     public Autor(String nome) {
        this.nome = nome;
    }
    // ---

    public String getFormacao() { 
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQtoLivro() {
        return this.qtoLivros;
    }

    public void setQtoLivro(int qtoLivro) {
        this.qtoLivros = qtoLivro;
    }

    @Override
    public String toString() {
        return ("Nome do Autor:\t" + this.nome + "\nFormação: " + this.formacao + "\nData de nascimento: " + this.dtNascimento);
    }

    public static Autor cadastrarAutor() {

        Scanner in = new Scanner(System.in);
        //autor
        System.out.print("Digite o nome do autor: ");
        String nome = in.next();
        if (nome.length() < 4){ 
            System.out.println("!!! O nome deve ter pelo menos 4 caracteres !!!\n");
            return cadastrarAutor();
        }
        Autor novoAutor = new Autor(nome);
        
        //formação
        System.out.print("Digite a formação do autor: ");
        novoAutor.setFormacao(in.next());

        //data
        System.out.print("Digite a data de nascimento do autor (dd/mm/yyyy): ");
        String data = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaData = LocalDate.parse(data, formatter);
        // System.out.println("Nova data = " + novaData.format(formatter));

        novoAutor.setDtNascimento(novaData);
        return novoAutor;

    }
    
}

