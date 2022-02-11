import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Print {

    public void printtela()throws AWTException, InterruptedException, FileNotFoundException,IOException{

        Robot robo =new Robot();
        robo.setAutoDelay(1000);

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

        Rectangle retanguloDoPrint = new Rectangle(
                (int) screensize.getWidth(),
                (int) screensize.getHeight()
        );

        BufferedImage imagemBuffer = robo.createScreenCapture(retanguloDoPrint);

        File arquivoImg = new File ("C:\\PrintsDeProjetosTeste/tela.png");
        if (arquivoImg.exists()){
            System.out.println(arquivoImg.getAbsolutePath());
        }
        try {
            ImageIO.write(imagemBuffer, "png", arquivoImg);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
