/* Name:
Dinh Hoang Thao Nguyen, ITITWE2008
Purpose: A simple version of the game Plants VS Zombies
*/
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.Random;
class NormalZombie extends Zombie {


    // Constructor for NormalZombie
    public NormalZombie(GamePanel parent, int lane) {
        super(parent, lane);

        setImage(parent.normalZombieImage);
    }

    // Method to set the image for the zombie
    private void setImage(Image image) {
        // Set the image for the zombie
    }
}
