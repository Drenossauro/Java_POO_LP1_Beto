import java.time.LocalDate;

public class Carro {
    private int id;
    private String name;
    private LocalDate dt_fabricacao; // data nao existe setLOCALDATE
    private double valor;


    public int getId() {
        return this.id;
    }
 
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDt_fabricacao() {
        return this.dt_fabricacao;
    }

    public void setDt_fabricacao(LocalDate dt_fabricacao) {
        this.dt_fabricacao = dt_fabricacao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "( id = " + id
                + " Nome = " + name
                + " Data de Fabricação = " + dt_fabricacao
                + " Valor = " + valor + ")";
    }
}
