package ProjetoPoo.src.revisao;

import java.time.format.DateTimeFormatter;

public class Estudante extends Pessoa {
    private String ra;
    private String curso;

    public Estudante(String _ra, String _nome) {
        this.ra = _ra;
        this.nome = _nome;

    }

    // GET e SET

    public String getRa() {
        return this.ra;
    }

    public void setRa(String _ra) {
        this.ra = _ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrever
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Nome: " + this.nome + "\nRA: " + this.ra + "\nCurso: " + this.curso + "\nData de nascimento: "
                + this.dtNascimento.format(f);
    }

}
