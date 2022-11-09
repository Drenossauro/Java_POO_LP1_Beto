package ex_ponto.heranca;

public class Gato extends AnimalTerrestre {

    public  Gato(){
        super();
    }


    @Override
    public void emitirSom(){
        System.out.println("Meowm");
    }
}
