1) Implementação WORD COUNT no estilo MAP REDUCE utilizando a linguagem SCALA 

      1.1)Temos diversas formas para elaborar um um WORD COUNTER e uma delas é utilizando o estilo MAP REDUCE, onde percebe-se a seguinte construção:
      * Dados de entrada são divididos em blocos
      * Map Function aplica uma determinada função a cada bloco de dados (divisão em pedaços de dados)
      * Reduce Function recupera esses pedaços e extrai algo (nesse caso a contagem das palavras). Aqui ocorre a transformação

      * Este algorítmo conidera um arquivo .txt como entrada e reorganiza as linhas do arquivo em uma lista que contém listas de 3 linhas do arquivo. Após essa etapa, vamos recuperar as palavras presentes nessas linhas adicionando-as em tuplas no formato: (palavra, 1). Com isso, recupermos as tuplas com as mesmas paavras para realizar a contagem da mesma, presente no arquivo de entrada.
  
  
 
 2) Como Rodar:
      * Obter a ferrameta de construção do scala SBT ou uma IDE específica. Link de apoio: https://www.scala-lang.org/download/
      * Rodar os comandos em sequência: sbt -> compile -> run