package ex_ponto.heranca;

public class Cao extends AnimalTerrestre {
    
    public Cao(){
        super();
    }
    
    @Override
    public void emitirSom(){
        System.out.println("au au");
    }
}
