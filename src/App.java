import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import efectos.Simples;

public class App {

    public static void main(String[] args) throws Exception {

        Simples sp =new Simples();
        
        try {
            BufferedImage image = ImageIO.read(new File("Img\\Lala.png"));
            BufferedImage image2 = ImageIO.read(new File("Img\\Img1.png"));

            int ancho = image.getWidth();
            int alto = image.getHeight();
            int ancho2 = image2.getWidth();
            int alto2 = image2.getHeight();

            //sp.grisEscala(image, ancho, alto);
            //sp.blancoNegro(image, ancho, alto);
            sp.negativo(image, ancho, alto,"l");
            sp.negativo(image2, ancho2, alto2,"i");
            sp.retro(image, ancho, alto, 5, "l");
            sp.retro(image2, ancho2, alto2, 5,"i");

            System.out.println("Imagen creada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
