import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // conectar a API
        
        API api = API.IMBD;
        String url = api.getUrl();


        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados importantes

        ExtratorDeConteudo extrator = api.getExtrator();
        List<Conteudo> conteudos = extrator.extrairConteudos(json);

        var geradora = new geradorfigurinhas();

        for (Conteudo conteudo : conteudos) {

            InputStream inputStream = new URL(conteudo.urlimagem()).openStream();
            String nomeArquivo = "saida2/" + conteudo.titulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println("\u001b[37m \u001b[44m Titulo: " + conteudo.titulo() + "\u001b[m");
            // System.out.println();

        }
    }
}
