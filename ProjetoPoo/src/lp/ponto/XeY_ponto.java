package ProjetoPoo.src.lp.ponto;

public class XeY_ponto {
    //Atributos
    private double x;
    private double y;
        
    public XeY_ponto() {}


    public XeY_ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Metodos

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }


    public double distance(XeY_ponto p1, XeY_ponto p2) {
        double d = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
        System.out.println(Math.sqrt(d));
        return Math.sqrt(d);
    }
}
