package ProjetoPoo.src.ex_ponto.classe;

public abstract class Construcao {
    protected double frente;
    protected double fundo;
    protected int qtoPortas;
    protected int qtoJanelas;
    protected double valor; 


    public double getFrente() { 
        return this.frente;
    }

    public void setFrente(double frente) {
        this.frente = frente;
    }

    public double getFundo() {
        return this.fundo;
    }

    public void setFundo(double fundo) {
        this.fundo = fundo;
    }

    public int getQtoPortas() {
        return this.qtoPortas;
    }

    public void setQtoPortas(int qtoPortas) {
        this.qtoPortas = qtoPortas;
    }

    public int getQtoJanelas() {
        return this.qtoJanelas;
    }

    public void setQtoJanelas(int qtoJanelas) {
        this.qtoJanelas = qtoJanelas;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public double alterarValor() {
        this.valor *= 1.1;
        return this.valor;
    }

    public double descontoVista() {
        return this.valor * 0.05;
    }

    public String toString() {
        return "toString da super classe";
    }

}
