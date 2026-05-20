package efectos;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Simples {

    public void grisEscala(BufferedImage entrada,int ancho,int alto){

        BufferedImage out = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {

                int pixel = entrada.getRGB(x, y);

                int a = (pixel >> 24) & 0xFF;
                int r = (pixel >> 16) & 0xFF;
                int g = (pixel >> 8) & 0xFF;
                int b = pixel & 0xFF;

                int media = (r+g+b)/3;

                int pixelN = (a << 24) | (media << 16) | (media << 8) | media;
                out.setRGB(x, y, pixelN);
                
            }
            
        }

        imprimirImg(out,"png","Gris");

    }

    public void blancoNegro(BufferedImage entrada,int ancho,int alto){

        BufferedImage out = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {

                int pixel = entrada.getRGB(x, y);

                int a = (pixel >> 24) & 0xFF;
                int r = (pixel >> 16) & 0xFF;
                int g = (pixel >> 8) & 0xFF;
                int b = pixel & 0xFF;

                int media = (r+g+b)/3;
                int color = (media < 127) ? 0 : 255;

                int pixelN = (a << 24) | (color << 16) | (color << 8) | color;
                out.setRGB(x, y, pixelN);
                
            }
            
        }

        imprimirImg(out,"png","BN");

    }

    public void imprimirImg(BufferedImage out, String tipo, String nombre){
        try {
            ImageIO.write(out,tipo, new File("Img\\Img"+ nombre +".png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}

