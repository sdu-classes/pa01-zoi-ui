// Olzhas Sadan 
// ID: 220103018
public class prac1 {
    public static void main(String[] args) {


        Ball ball = new Ball(-5f , -6f , 5 , 7f , 8f);
        System.out.println(ball);
        
        ball.move();
        System.out.println(ball);
        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);
        ball.reflectVertical();
        ball.move();
        System.out.println(ball);






    }
}
class Ball {
    private float x;
    private float y;
    private int r;
    private float x_delta;
    private float y_delta;

    public Ball(float x, float y, int r, float x_delta, float y_delta) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.x_delta = x_delta;
        this.y_delta = y_delta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public float getX_delta() {
        return x_delta;
    }

    public void setX_delta(float x_delta) {
        this.x_delta = x_delta;
    }

    public float getY_delta() {
        return y_delta;
    }

    public void setY_delta(float y_delta) {
        this.y_delta = y_delta;
    }

    void move() {
        x += x_delta;
        y += y_delta;

    }
    public  void reflectHorizontal() {
        x_delta = -x_delta;
    }

    public void reflectVertical() {
        y_delta = -y_delta;
    }

    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + x_delta + "," + y_delta + ")]";
    }
}
