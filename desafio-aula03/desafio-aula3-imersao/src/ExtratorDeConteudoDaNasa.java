
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo {

    public List<Conteudo> extrairConteudos(String json) {

        // extrair as informações do json titulo, poster, classificacao

        JsonParser parser = new JsonParser();
        List<Map<String, String>> listadeAtributos = parser.parse(json);

        
        return listadeAtributos.stream().map(atributos -> new Conteudo (atributos.get("title"), atributos.get("url"))).toList();
        

    }

}
