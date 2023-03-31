ANOTAÇÕES

Nessa aula, foi realizado a refatoração e aplicado a orientação a objetos.

DESAFIOS

1. Substituir a classe conteudo por um Record.
   Essa funcionalidade foi implantada no java 16, permite declarar classes imutáveis de forma mais concisa e eficiente.A diferença entre um record e uma classe normal é que o record tem uma sintaxe mais concisa e implícita. Ao usar records, você não precisa escrever manualmente esses métodos, o compilador Java irá gerá-los automaticamente para você.

2. Criar propria excecao: foi criado uma classe e aplicado o extend Runexception

3. Foi fimplificado a funcao extratordecondeudoNASA e IMBD, ao realizar a copia da listadeatributos, para conteudo, utilizando o metododo .stream().map() e lambda (->):

return listadeAtributos.stream().map(atributos -> new Conteudo (atributos.get("title"), atributos.get("image"))).toList();

Primeiro, é chamado o método stream() na lista listadeAtributos, que cria uma sequência de elementos da lista para serem processados em uma pipeline de operações.

Em seguida, é aplicado o método map() na pipeline de operações, que transforma cada elemento da sequência em outro objeto, de acordo com a função lambda passada como argumento.

Na função lambda, é criado um novo objeto Conteudo com os valores dos atributos "title" e "image" do elemento da sequência.

Por fim, é utilizado o método toList() para coletar os resultados da pipeline de operações em uma nova lista de objetos Conteudo.

Ou seja, o resultado final é uma lista de objetos Conteudo, onde cada objeto foi criado a partir dos atributos "title" e "image" da lista inicial.

4. Desafio 04: Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado.

---

Classe ClienteHttp é responsável por criar e retornar um cliente http para acesso à alguma api web. Processos realizados por esta classe:

               // transforma a string em uma instancia de URI.
               // cria um novo client HTTP (ex: um navegador acessando um endereco qualquer)
               // envia uma solicitacao HTTP para um servidor web
               // Envia a solicitacao HTTP e retorna a resposta ocmo uma string. BodyHandlers.ofString() é usado para especificar que a resposta do servidor deve ser lida como uma string.
               // seleciona o body (todo conteudo) da string.

Classe geradoradeFigurinhas, utiliza o método inputstream para receceber uma imagem e uma String com o nome do arquivo, edita a imagem e a salva em um endereço de saída. Processos realizados por esta classe:

               //Recebe a img
               // pegar dimensoes da nova imagem
               //criar nova imagem em buffer (memoria)
               //utiliza o pacote graphics que é a "caneta" utilizada para escrever na nova imagem
               //inserir texto
               //criar arquivo para nova imagem

Classe JsonParser, realiza a manipulação do json fornecido pela API, para tratamento e criacao da lista de objetos. (Este trecho foi copy paste no curso)

Classe Conteudo é utilizada para encapsular e organizar informações relacionadas a um conteúdo, facilitando a manipulação dessas informações ao longo do código.
//Em resumo, a classe Conteudo é utilizada como um modelo para representar e manipular informações relacionadas a um conteúdo, facilitando a organização e manipulação dessas informações no código.

Classe Extrator de conteudo Nasa e IMDB, vao receber o json tratado pela classe JsonParser e criar nova lista com os dados extratidos (titulo e imagem)

Interface extratorDeConteudo, utilizado para otimizar o codigo, de forma que sempre que for chamado a classe extrator, seja feito utilizando o metodo declarado na interface.
