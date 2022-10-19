package classes;





public class Aula2 {
    
    public static void main(String[] args){
        
        // estou criando um objeto do tipo Cachorro chamado doguinho
        // estou instanciando atraves do operador new
        // apos o new eu chamo o construtor da classe

        Cachorro doguinho = new Cachorro("doguinho"); //objeto doguinho
                                //Construtor - 

        doguinho.setNome("Rex");
        doguinho.setIdade(7);
        doguinho.setRaca ("Caramelo");    //classificando o objeto
        doguinho.setDono (true);
        doguinho.setCastrado (false);
        doguinho.setPeso (7.3);
        
        System.out.println(doguinho.toString());
        
        // System.out.println(doguinho.getNome());  //comando para imprimir
        // System.out.println(doguinho.getIdade());  //comando para imprimir
        // System.out.println(doguinho.getRaca());  //comando para imprimir
        // System.out.println(doguinho.getDono());  //comando para imprimir
        // System.out.println(doguinho.getCastrado());  //comando para imprimir
        // System.out.println(doguinho.getPeso());  //comando para imprimir
        
        

    }
}

     