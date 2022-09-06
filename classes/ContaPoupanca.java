package classes;



public class ContaPoupanca {
    // Atributos
    private String nome;
    private double saldo;
    private int conta; 
    private int agencia;
   
   
    public ContaPoupanca(double saldo_inicial){
        this.saldo = saldo_inicial;
   
    }
   
    //Getters and setters
   
    //NOME
    public String getNome() {
       return nome;
    }
   
    public void setNome(String nome) {
       this.nome = nome;
    }
    //SALDO
    public double getSaldo() {
        return saldo;
    }

    // public void setSaldo(double saldo){
    // this.saldo = saldo;
    // }
   
    //CONTA
    public int getConta() {
        return conta;
    }
   
    public void setConta(int conta) {
        this.conta = conta;
    }

    //AGENCIA
    public int getAgencia(){
        return agencia;
        }
    public void setAgencia(int agencia){
        this.agencia = agencia;

    }

    // _________ METODOS __________

    @Override
    public String toString() { // transformar objeto em string
        return ("Nome: " + this.nome +  "\n Saldo:" + this.saldo + "\n Conta:" + this.conta
        + "\n Agencia:" + this.agencia);
    }

    // Metodos
    
    public String depositar(int valor){
        if(valor > 0){
            this.saldo += valor;
            return "Deposito efetuado";
        }
        return "Deposito não efetuado! Verifique o valor.";
    }

    public String sacar(int valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return "Saque efetuado retire seu dinheiro!";
        }

        return "ERRO ao efetuar o saque, verifique seu saldo!";
    }
       
    public double exibirSaldo(){
        return this.saldo;
    }

   
      
   
    
}
