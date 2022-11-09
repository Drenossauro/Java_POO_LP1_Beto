package ex_ponto.interfacess;

public class Triangulo implements FiguraGeometrica {
// metodos   
    @Override
    public double raiz(double a, double b){
        double soma = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(soma);
    }
// metodos
    @Override
    public double areaTriangulo(double a, double b) {
        return (b * a)/2;
    }
}
