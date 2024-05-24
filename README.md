# Desafio de Conversor de Moedas

## Descrição do Desafio

O objetivo deste desafio é criar um programa em Java que permita a conversão de valores entre diferentes moedas utilizando uma API de taxa de câmbio. O programa deve solicitar ao usuário a moeda de origem, a moeda de destino e o valor a ser convertido, e então exibir o resultado da conversão.

### Requisitos

1. **Entrada do Usuário**:
    - Moeda de origem (ex: BRL para Real Brasileiro).
    - Moeda de destino (ex: USD para Dólar Americano).
    - Valor a ser convertido.

2. **Processamento**:
    - Utilizar uma API para obter a taxa de conversão entre as duas moedas.
    - Calcular o valor convertido com base na taxa de conversão obtida.

3. **Saída**:
    - Exibir o valor convertido, a moeda de origem, a moeda de destino e a taxa de conversão utilizada.

### API Utilizada

Para realizar as conversões de moeda, foi utilizada a API da ExchangeRate-API (https://www.exchangerate-api.com/), que fornece taxas de câmbio atualizadas.

## Solução

A solução foi implementada em Java e consiste em três classes principais: `Converter`, `ApiConverter` e `Principal`.

### Classe `Converter`

Esta classe representa uma conversão de moeda. Ela armazena a moeda de origem, a moeda de destino, o valor a ser convertido, a taxa de conversão e o resultado da conversão.

### Classe `ApiConverter`
Esta classe é responsável por interagir com a API de conversão de moeda. Ela monta a URL da API, envia a requisição e processa a resposta para obter a taxa de conversão e o resultado da conversão.

### Classe `Principal`
Esta é a classe principal do programa, responsável pela interação com o usuário. Ela solicita as informações necessárias, cria uma instância da classe Converter e utiliza a classe ApiConverter para obter a conversão desejada.

### Como Executar
1. Certifique-se de ter o JDK instalado em sua máquina.
2. Compile as classes Java
3. Execute o programa
4. Siga as instruções exibidas no console para realizar conversões de moeda.
