package ProjetoPoo.src.lp.ex_robo;



public class Robo {
    private int x;
    private int y;

 //GET AND SET
    public double getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Robo(int _x, int _y) { 
        this.x = _x;
        this.y = _y;
    }
    

    public void move(char dir, int qtoMove) {}
    //cima
    public void top(int adicionar){
        y += adicionar;
    }
    //baixo
    public void down(int diminuir){
        y -= diminuir;
    }
    //esquerda
    public void left(int adicionar){
        x += adicionar;
    }
    //direita
    public void right(int diminuir){
        x -= diminuir;
    }
}
