package ex_ponto.ex_cinema;

import java.time.LocalDate;

public class Bilhete {
    private String codigo;
    private LocalDate dtCompra;
    private String local;
    private String preco;
    private String acento;
     

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDtCompra() {
        return this.dtCompra;
    }

    public void setDtCompra(LocalDate dtCompra) {
        this.dtCompra = dtCompra;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPreco() {
        return this.preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getAcento() {
        return this.acento;
    }

    public void setAcento(String acento) {
        this.acento = acento;
    }

}
