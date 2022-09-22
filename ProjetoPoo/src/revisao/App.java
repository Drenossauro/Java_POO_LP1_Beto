package ProjetoPoo.src.revisao;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Estudante obj1 = new Estudante("201202120","Beto");
        obj1.setCurso("TADS");
        obj1.setDtNascimento(LocalDate.of(2020, 5, 1));
        System.out.println(obj1);

        // 'Funcionario func1 = new Funcionario("","");

        Autor objAutor = new Autor();
        objAutor.setNome("leticia");
        objAutor.setArea("TADS");

        Livro objLivro = new Livro();
        objLivro.setTitulo("POO");
        objLivro.setAnoLancamento(2022);
        objLivro.setEditora("LIVRAA");
        objLivro.setNpag(203);
        objLivro.setAutor(objAutor);

        System.out.println(objLivro.getAutor());
    }
}
