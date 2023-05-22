import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{
    int xVelocity;
    int yVelocity;
    int initialSpeed = 5;
    int RandomXDirection;
    int RandomYDirection;
    Random random;
    Ball(int x, int y, int width, int height){

            super(x,y,width,height);

            random= new Random();
            RandomXDirection = random.nextInt(2); //this is to pick random values from 0-2
        //so ball can start from any random direction

            if(RandomXDirection==0){
                RandomXDirection--;
            }
            else{

            }
            setXDirection (RandomXDirection);

            int RandomYDirection = random.nextInt(2);
            if(RandomYDirection==0){
                RandomYDirection--;
            }

            setYDirection(RandomYDirection);

    }

    public void setYDirection(int randomYDirection) {
        yVelocity = RandomYDirection;
    }

    public void setXDirection(int randomXDirection) {

        xVelocity = RandomXDirection;
    }

    public void move(){
        x += xVelocity;
        y += yVelocity;

    }
    public void draw(Graphics g){
        g.setColor(Color.pink);
        g.fillOval(x,y,width,height);

        //middle line
        g.setColor(Color.yellow);
        g.drawLine(1000/2, 0, 1000/2, 555 );
    }
}
