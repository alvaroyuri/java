import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // conectar a API
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-12-29&end_date=2022-12-31";
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados importantes

        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();
        List<Conteudo> conteudos = extrator.extrairConteudos(json);

        var geradora = new geradorfigurinhas();

        for (Conteudo conteudo : conteudos) {

            InputStream inputStream = new URL(conteudo.getUrlimagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println("\u001b[37m \u001b[44m Titulo: " + conteudo.getTitulo() + "\u001b[m");
            // System.out.println();

        }
    }
}
