import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class geradorfigurinhas {

    public void cria(InputStream inputStream, String nomeArquivo) throws Exception {

        // receber por url
        // InputStream inputStream = new
        // URL("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies_10.jpg").openStream();

        // receber por arquivo local
        // InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));

        BufferedImage ImagemOriginal = ImageIO.read(inputStream);

        int largura = ImagemOriginal.getWidth();
        int altura = ImagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(ImagemOriginal, 0, 0, null);

        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 120);
        graphics.setFont(fonte);
        graphics.setColor(Color.GREEN);
        graphics.drawString("hello", 680, novaAltura - 100);

        ImageIO.write(novaImagem, "png", new File(nomeArquivo));

    }

}
