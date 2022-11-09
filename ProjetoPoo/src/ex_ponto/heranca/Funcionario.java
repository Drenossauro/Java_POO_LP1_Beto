package ex_ponto.heranca;

public class Funcionario {
    private int matricula;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "{" + " matricula='" + getMatricula() + "'" +"}";
    }


}
