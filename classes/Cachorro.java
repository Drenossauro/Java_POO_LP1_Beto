



public class Cachorro {
// Atributos
    private String nome;
    private int idade;
    private String raca;
    private boolean dono;
    private boolean castrado;
    private double peso;
    
// Construtor  - criar e alocar

// public Cachorro(){

// }


public Cachorro(String name){
    System.out.println("Estou sendo criado com o nome: " + name);
}


// GETTERS-atribuir e SETTERS-

//Nome
public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

//Idade
public void setIdade(int idade){
    this.idade = idade;
}

public int getIdade(){
    return this.idade;
}

//Raca
public void setRaca(String raca){
    this.raca = raca;
}

public String getRaca(){
    return this.raca;
}

//Dono
public void setDono(boolean dono){
    this.dono = dono;
}

public boolean geDono(){
    return this.dono;
}

//Castrado
public void setCastrado(boolean castrado){
    this.castrado = castrado;
}

public boolean getCastrado(){
    return this.castrado;
}

//Peso
public void setPeso(double peso){
    this.peso = peso;
}

public double getPeso(){
    return this.peso;
}


// Metodos 
    public String toString(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nRaça: " + this.raca + "\nDono: " + this.dono + "\nCastrado: " + this.castrado + "\nPeso: " + this.peso + "kg";
    }



}



