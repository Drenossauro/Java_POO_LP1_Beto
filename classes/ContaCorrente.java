



public class ContaCorrente {
    // Atributos
    private String nome;
    private double saldo;
    private int conta; 
    private int agencia;
    private double limite;


    public ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;

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

    //LIMITE
    public double getLimite(){
       return limite;
    }

    public void setLimite( double limite){
        this.limite =limite;
    }

 
    

        // _________ METODOS __________

    @Override
    public String toString() { // transformar objeto em string
        return ("Nome: " + this.nome +  "\n Saldo:" + this.saldo + "\n Conta:" + this.conta
        + "\n Agencia:" + this.agencia);
    }
 
    //METODOS
    
    public String depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Saldo = R$" + this.saldo);
            return "Deposito efetuado!";   
        } 
        
        return "Deposito não efetuado! Verifique o valor.";
    }
    
    public String sacar(double valor){
        if( valor > 0 && valor <= this.saldo + this.limite){
            this.saldo -= valor;

            System.out.println("Saldo apos o saque = R$" + this.saldo);
            return "Saque efetuado retire seu dinheiro!";
        }else{
            
           return "ERRO ao efetuar o saque, verifique seu saldo!";
        }
 
    }

    // public double exibirSaldo(){
    //     return this.saldo;
    // }

        
    
}
    
