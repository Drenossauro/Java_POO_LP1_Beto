



public class MeuBanco {

    public static void main(String[] args) {
        ContaCorrente conta_paulo = new ContaCorrente(0,500);
        conta_paulo.setNome("Paulo");
        conta_paulo.setAgencia(124);
        conta_paulo.setConta(001);

        conta_paulo.depositar(120);
        conta_paulo.depositar(75.20);

        conta_paulo.sacar(10000);
    }
    
    
}
