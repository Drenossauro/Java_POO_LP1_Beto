package ProjetoPoo.src.lp.ex_robo;

public class Robo {
    private int x;
    private int y;
    
    public Robo(int x, int y) { 
        this.x = x;
        this.y = y;
    }

    //GET AND SET
    public int getX() {
        return x;
    }

    // public void setX(int x) {
    //     this.x = x;
    // }

    public int getY() {
        return y;
    }

    // public void setY(int y) {
    //     this.y = y;
    // }

    // public void move(char dir, int qtoMove) {}
    //cima
    public void top(int adicionar){
        y += adicionar;
    }
    //baixo
    public void down(int subtrair){
        y -= subtrair;
    }
    //esquerda
    public void left(int adicionar){
        x += adicionar;
    }
    //direita
    public void right(int subtrair){
        x -= subtrair;
    }
}
