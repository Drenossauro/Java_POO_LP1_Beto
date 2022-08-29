package ProjetoPoo.src.ex_ponto.ex_heranca;

// import java.rmi.server.LoaderHandler;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dtLancamento;
    
    // ----
    public Livro(String titulo) {
        this.titulo = titulo;
    }
    // ---

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    @Override
    public String toString() {
        return ("Titulo:\t" + this.titulo  + "\nEditora: " + this.editora + "\nData Lançamento: " + this.dtLancamento);
        // DaterTimeFormatter
    }

    public static Livro cadastrarLivro() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o titulo do livro: ");
        String titulo = in.next();
        if (titulo.length() < 2) {
            System.out.println("O titulo deve ter pelo menos 2 catacteres!");
            return null;
        }

        Livro novoLivro = new Livro(titulo);
        System.out.print("Digite a editora do livro: ");
        novoLivro.setEditora(in.next());

        System.out.print("Digite a data de lançamento (dd/mm/yyyy): ");
        String data = in.next();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate novaData = LocalDate.parse(data, formatter);

        // System.out.println("Nova data = " + novaData.format(formatter));

        // if (data.length() != 3) {
        //     System.out.println("Digite a data corretamente");
        //     in.close();
        //     return null;
        // }

        // int dd = Integer.parseInt(dtLanc[0]);
        // int m = Integer.parseInt(dtLanc[1]);
        // int a = Integer.parseInt(dtLanc[2]);
        // LocalDate d = LocalDate.of(a, m, dd);

        novoLivro.setDtLancamento(novaData);
        // System.out.println(novoLivro.toString());
        // in.close();
        return novoLivro;
    }

}
