ANOTAÇÕES

Nessa aula, foi realizado a refatoração e aplicado a orientação a objetos.

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





