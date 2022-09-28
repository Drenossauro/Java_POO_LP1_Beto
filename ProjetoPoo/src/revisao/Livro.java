package ProjetoPoo.src.revisao;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private int anoLancamento;
    private String editora; //deveria ser um objeto
    private int npag;
    private Autor autor; // setar um obj

    public Livro(String _titulo, int _anoLancamento, String _editora, int _npag, Autor _autor) {
        this.titulo = _titulo;
        this.anoLancamento = _anoLancamento;
        this.editora = _editora;
        this.npag = _npag;
        this.autor = _autor;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNpag() {
        return this.npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    

    public static Autor lerLivro(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o titulo do Livro: ");
        String titulo = in.nextLine();

        System.out.print("Digite o titulo do Livro: ");
        Integer anoLancamento = in.nextInt();

        System.out.print("Digite o titulo do Livro: ");
        String editora = in.nextLine();

        System.out.print("Digite o titulo do Livro: ");
        Integer npag = in.nextInt();

        System.out.print("Digite o titulo do Livro: ");
        String autor = in.nextLine();

        Livro objLivro = new Livro(titulo, anoLancamento, editora, npag, autor);
        return objLivro;


    }


}
