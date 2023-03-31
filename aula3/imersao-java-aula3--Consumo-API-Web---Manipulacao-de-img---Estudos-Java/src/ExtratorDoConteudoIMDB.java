import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDoConteudoIMDB implements ExtratorDeConteudo {

    public List<Conteudo> extrairConteudos(String json) {

        // extrair as informações do json titulo, poster, classificacao

        JsonParser parser = new JsonParser();
        List<Map<String, String>> listadeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        // popular a lista de conteudos
        for (Map<String, String> atributos : listadeAtributos) {

            String titulo = atributos.get("title");
            String urlImagem = atributos.get("image");
            var conteudo = new Conteudo(titulo, urlImagem);

            conteudos.add(conteudo);

        }

        return conteudos;

    }

}

    
