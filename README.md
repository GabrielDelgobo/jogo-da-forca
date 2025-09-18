Jogo da Forca em Java
Este e um projeto simples de um Jogo da Forca desenvolvido em Java, onde o jogador tenta adivinhar uma palavra secreta chutando letras.

Funcionalidades
Escolha aleatoria de palavras de um banco pre-definido

Controle de tentativas (maximo de 6 erros)

Exibicao do estado atual da palavra com letras acertadas

Verificacao de vitoria/derrota

Interface via linha de comando (CLI) interativa

Estrutura do Projeto
O projeto e composto por 4 classes principais:

1. Main.java
Classe principal que inicia o jogo

Gerencia a interacao com o usuario

Controla o fluxo do jogo

2. Jogo.java
Classe que implementa a logica principal do jogo

Controla tentativas, erros e estado da palavra

Verifica condicoes de vitoria/derrota

3. Palavra.java
Representa a palavra secreta a ser adivinhada

Armazena e fornece acesso a palavra

4. Jogador.java
Representa o jogador

Armazena informacoes do jogador (nome)

Como Executar
Pre-requisitos
Java JDK 8 ou superior instalado

Terminal/Command Prompt

Passos para execucao:
Compile os arquivos Java:

bash
javac *.java
Execute o programa:

bash
java Main
Siga as instrucoes no terminal:

Digite seu nome

Chute letras para tentar adivinhar a palavra

Voce tem ate 6 tentativas erradas

Regras do Jogo
O jogador deve adivinhar a palavra secreta chutando letras

Cada letra errada conta como um erro

O jogo termina quando:

O jogador acerta todas as letras (vitoria)

O jogador comete 6 erros (derrota)

Palavras Disponiveis
O jogo inclui um conjunto de 15 palavras em portugues:

computador, java, programacao, teclado, monitor

internet, celular, guitarra, hospital, mercado

professor, engenheiro, pizza, futebol, parque

Possiveis Melhorias Futuras
Adicionar sistema de pontuacao

Implementar diferentes dificuldades

Adicionar mais palavras (arquivo externo)

Interface grafica (GUI)

Modo multiplayer

Dicas para as palavras

Desenvolvido por
Gabriel Delgobo

