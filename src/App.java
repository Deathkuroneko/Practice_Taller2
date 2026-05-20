import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import efectos.Simples;

public class App {

    public static void main(String[] args) throws Exception {

        Simples sp =new Simples();
        
        try {
            BufferedImage image = ImageIO.read(new File("Img\\Lala.png"));

            int ancho = image.getWidth();
            int alto = image.getHeight();

            //sp.grisEscala(image, ancho, alto);
            //sp.blancoNegro(image, ancho, alto);
            sp.negativo(image, ancho, alto);
            sp.retro(image, ancho, alto, 15);

            System.out.println("Imagen creada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
