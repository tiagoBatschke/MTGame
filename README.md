MTGame
Integrantes do Grupo
Matheus Farias Dos Santos
Tiago José Batschke De Souza
Gustavo Alvez Marcelino
Beatriz Bardela Dos Santos


Link do Repositório no GitHub


https://github.com/tiagoBatschke/MTGame

Como Executar o Jogo
1. Clonar o Repositório
Primeiro, clone o repositório do projeto usando o comando abaixo:


git clone https://github.com/tiagoBatschke/MTGame


2. Estrutura do Projeto
Após clonar o projeto, verifique se ele está estruturado como abaixo:


MTGame/
├── src/
│   ├── Main.java
│   ├── personagens/
│   │   ├── Personagem.java
│   │   └── Irias.java
│   ├── aventura/
│   │   └── Aventura.java
│   └── utils/
│       └── Narrativa.java
└── bin/ (será criado após a compilação)
3. Compilar o Jogo

Para compilar o jogo, execute o comando abaixo no terminal a partir do diretório principal do projeto:

javac -d bin src/*.java src/personagens/*.java src/aventura/*.java src/utils/*.java

Esse comando compilará os arquivos .java e criará os arquivos .class na pasta bin.

4. Executar o Jogo
Após a compilação, execute o jogo com o seguinte comando:

bash
Copiar código
java -cp bin Main
Exemplo de Execução
Ao iniciar o jogo, o jogador verá um prólogo inicial e terá a opção de selecionar um personagem. Em seguida, a aventura começa, e o jogador tomará decisões interativas e acompanhará o desenrolar da narrativa.