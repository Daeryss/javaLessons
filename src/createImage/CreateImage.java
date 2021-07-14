package createImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreateImage {
    public static void main(String[] args) {
        int w = 500;
        int h = 300;

        BufferedImage bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d =bufferedImage.createGraphics();

        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, w, h);

        g2d.setColor(Color.black);
        g2d.fillOval(0, 0, w, h);

        g2d.setColor(Color.blue);
        g2d.drawString("Hello, Pirozhocheck!", 25, 125);

        g2d.dispose();

        File file = new File("testImage.png");
        try {
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        double size = file.length() / 1024;
        System.out.println(size);

    }
}
