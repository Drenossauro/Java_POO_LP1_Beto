package ex_ponto.interfacess;



public class TesteInterface{

    public static void main(String[] args) {
        double a = 10, b = 20;
        Triangulo reto = new Triangulo();
        System.out.println("\nÁrea do triângulo = " + reto.areaTriangulo(a, b));
        System.out.println("Raiz do triângulo = " + reto.raiz(a, b) + "\n");
        
    }
        
    
}
