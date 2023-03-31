public class Conteudo {
    
    private final String titulo;
    private final String urlimagem;

     
    public String getUrlimagem() {
        return urlimagem;
    }


    public String getTitulo() {
        return titulo;
    }


    //Esse trecho de código é o construtor da classe Conteudo. Ele é utilizado para inicializar os valores dos atributos titulo e urlimagem da classe Conteudo

    public Conteudo(String titulo, String urlimagem) {
        this.titulo = titulo;
        this.urlimagem = urlimagem;
    }




}
