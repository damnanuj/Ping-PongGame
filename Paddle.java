import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle{
    int id;
    int yVelocity;
    int speed=10;


    Paddle(int x, int y, int Paddle_width, int Paddle_Height, int id){
            super(x,y,Paddle_width, Paddle_Height);
            this.id = id;
    }
    public void keyPress(KeyEvent e){
        switch (id){
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(-speed); //if i am pressing key w
                    // my paddle need to go in upper direction thats why -speed (negative)
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(speed);  //if i am pressing s paddle will go down
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_O){
                    setYDirection(-speed);
                }
                if(e.getKeyCode()==KeyEvent.VK_L){
                    setYDirection(speed);
                }
                break;
        }

    }

    private void setYDirection(int Direction) {
        yVelocity = Direction;
    }

    public void KeyRelease(KeyEvent e){
        switch (id){
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(0);
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_O){
                    setYDirection(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_L){
                    setYDirection(0);
                }
                break;
        }

    }
    public void move(){  //this move function will be responsible for paddle to move in y Dorection
            y=y+yVelocity;
    }
    public void draw(Graphics g){
        if(id==1){
            g.setColor(Color.red);
        }
        else if(id==2){
            g.setColor(Color.blue);
        }
        g.fillRect(x,y,width, height);
    }

}
