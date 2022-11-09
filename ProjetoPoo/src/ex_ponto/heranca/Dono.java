package ex_ponto.heranca;

public class Dono extends Pessoa {
    AnimalTerrestre animal;


    public AnimalTerrestre getAnimal() {
        return this.animal;
    }

    public void setAnimal(AnimalTerrestre animal) {
        this.animal = animal;
    }
    private int qtoAnimais;

    public int getQtoAnimais() {
        return this.qtoAnimais;
    }

    public void setQtoAnimais(int qtoAnimais) {
        this.qtoAnimais = qtoAnimais;
    }

    // construtor
    public Dono() {
        super(); //chama construtor da superclasse
    }



    public void alimentarAnimal(Cao animal){
        System.out.println("Estou alimentando o cao chamado: " + animal.getNome());
    }

    public void alimentarAnimal(Gato animal){
        System.out.println("Estou alimentando o gato chamado: " + animal.getNome());
    }

    @Override //sinalizar que aquele metodo esta sendo (subescrever)
    public void andar(){
        this.passos += 2;
        System.out.println(this.nome + " esta correndo");
    }
    
}
