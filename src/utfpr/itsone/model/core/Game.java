package utfpr.itsone.model.core;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game {
    private static Long cont = 0l;
    private long id;
    private String name;
    private String plataform;
    private String description;
    private BufferedImage cover;
    private BufferedImage background;

    public Game(String name, String description) {
        id = cont++;
        this.name = name;
        this.description = description;
        setCover();
        setBackground();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BufferedImage getCover() {
        return cover;
    }

    public void setCover() {
        this.cover = setImage("cover");
    }

    public BufferedImage getBackground() {
        return background;
    }

    public void setBackground() {
        this.background = setImage("background");
    }

    public BufferedImage setImage(String path){
        try {
            if ((getClass().getClassLoader().getResource("utfpr/itsone/resources/"+path+"/"+getId()+".jpg") != null))
                return ImageIO.read(getClass().getClassLoader().getResource("utfpr/itsone/resources/"+path+"/"+getId()+".jpg"));
            else
                return ImageIO.read(getClass().getClassLoader().getResource("utfpr/itsone/resources/blank.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BufferedImage createResizedCopy(Image originalImage,
                                                  int scaledWidth, int scaledHeight,
                                                  boolean preserveAlpha)
    {
        int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
        BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
        Graphics2D g = scaledBI.createGraphics();
        if (preserveAlpha) {
            g.setComposite(AlphaComposite.Src);
        }
        g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
        g.dispose();
        return scaledBI;
    }
}