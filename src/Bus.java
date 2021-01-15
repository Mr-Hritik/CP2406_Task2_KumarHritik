import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;

public class Bus extends Car{
    Image my_image1, my_image2, my_image3, my_image4;
    Bus(Road road){
        super(road);
        width = 140;
        height = 45;
        try {
            my_image1 = ImageIO.read(new File("resources/bus1.png"));
            my_image2 = ImageIO.read(new File("resources/bus2.png"));
            my_image3 = ImageIO.read(new File("resources/bus3.png"));
            my_image4 = ImageIO.read(new File("resources/bus4.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    /***public void paintMeHorizontal(Graphics g){
     g.setColor(Color.BLUE);
     g.fillRect(xPosition, yPosition, width, height);
     }
     public void paintMeVertical(Graphics g){
     g.setColor(Color.BLUE);
     g.fillRect(xPosition, yPosition, width, height);
     }**/
    public void paintMeHorizontal(Graphics g) {
        // g.setColor(Color.RED);
        // g.fillRect(x, y, width, height);
        if (getRoadCarIsOn().getTrafficDirection().equals("east")) {
            g.drawImage(my_image1, xPosition, yPosition, null);
        }
        else if (getRoadCarIsOn().getTrafficDirection().equals("west")) {
            g.drawImage(my_image2, xPosition, yPosition, null);
        }
    }
    public void paintMeVertical(Graphics g) {
        // g.setColor(Color.RED);
        // g.fillRect(x, y, width, height);
        if (getRoadCarIsOn().getTrafficDirection().equals("north")) {
            g.drawImage(my_image3, xPosition, yPosition, null);
        }
        else if (getRoadCarIsOn().getTrafficDirection().equals("south")) {
            g.drawImage(my_image4, xPosition, yPosition, null);
        }
    }
}