package ProjetoPoo.src.lp.ex_robo;



public class Robo {
    private double x;
    private double y;


    public Robo(double _x, double _y) { 
        this.x = _x;
        this.y = _y;
    }
    

    public void move(char dir, int qtoMove) {}

    public void top(int adicionar){
        y += adicionar;
    }
 
    public void down(int diminuir){
        y -= diminuir;
    }

    public void left(int adicionar){
        x += adicionar;
    }

    public void right(int diminuir){
        x -= diminuir;
    }
}
