package ex_ponto.classe;

public class Residencial extends Construcao implements Contrato {
    // atributos
    private int num;
    private String nome; // casa verde
  
    private boolean ocupada; 
  
    public Residencial(String _nome, boolean _ocupada) {
      this.nome = _nome;
      this.ocupada = _ocupada;
    } 
  
    public Residencial(
      int num, 
      String nome,
      int qtoPortas,
      int qtoJanelas,
      boolean ocupada,
      double valor
    ) {
      super();
      this.num = num;
      this.nome = nome;
      this.ocupada = ocupada;
    }
  
    // GETTER AND SETTER
  
    public int getNum() {
      return this.num;
    }
  
    public void setNum(int num) {
      this.num = num;
    }
  
    public String getNome() {
      return this.nome;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public boolean isOcupada() {
      return this.ocupada;
    }
  
    public boolean getOcupada() {
      return this.ocupada;
    }
  
    public void setOcupada(boolean ocupada) {
      this.ocupada = ocupada;
    }
  
    @Override
    public String toString() {
      return "Polimorfismo de residencia";
    }

    public double descontoVista() {
        return this.valor * 0.1;
    }

    @Override
    public double area(Construcao obj){
        return obj.getFrente() * obj.getFundo();
    }
    

  }
