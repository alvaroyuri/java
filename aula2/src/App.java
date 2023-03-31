import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // conectar a API <---------------

        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";

        // transforma a string em uma instancia de URI. 
        URI endereco = URI.create(url);

        // cria um novo client HTTP (ex: um navegador acessando um endereco qualquer)
        HttpClient client = HttpClient.newHttpClient();

        // envia uma solicitacao HTTP para um servidor web
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        
        // Envia a solicitacao HTTP e retorna a resposta como uma string.
        // BodyHandlers.ofString() é usado para especificar que a resposta do servidor
        // deve ser lida como uma string.
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        // seleciona o body (todo conteudo) da string.
        String body = response.body();

        // extrair as informações do json titulo, poster, classificacao
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listafilmes = parser.parse(body);

        // exibir e manipular os dados importantes <---------------

        // este laco vai pegar a lista de, gerada pelo parser, repasar o link da imagem
        // e o titulo para criar a figurinha.
        var geradora = new geradorfigurinhas();
        for (Map<String, String> filme : listafilmes) {

            InputStream inputStream = new URL(filme.get("image")).openStream();
            String nomeArquivo = filme.get("title") + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println("\u001b[37m \u001b[44m Titulo: " + filme.get("title") + "\u001b[m");
            // System.out.println("Link imagem" + filme.get("image"));
            // System.out.println("Rating" + filme.get("imDbRating"));
            // System.out.println();

        }
    }
}
