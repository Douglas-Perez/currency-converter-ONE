# Conversor de Moedas

![GitHub last commit](https://img.shields.io/github/last-commit/Douglas-Perez/currency-converter-ONE)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=java\&logoColor=white)
![Gson](https://img.shields.io/badge/Gson-2.10.1-4CAF50)
![API](https://img.shields.io/badge/API-ExchangeRate--API-blue)

Este é um projeto simples de **Conversor de Moedas** desenvolvido em Java como desafio do curso Oracle Next Education (ONE). A aplicação consome a API ExchangeRate-API para obter taxas de câmbio em tempo real e converter valores entre moedas pré-definidas.

## Funcionalidades

* **Seleção de Moeda de Origem e Destino**: Escolha a moeda base e a moeda final via menu no terminal.
* **Consulta de Taxas em Tempo Real**: Integração com a ExchangeRate-API.
* **Conversão de Valores**: Calcula e exibe o valor convertido com base na taxa obtida.

## Como Usar

1. **Selecionar Moeda de Origem (DE)**:

   * Escolha entre BRL, USD, ARS, BOB, CLP ou COP.
2. **Selecionar Moeda de Destino (PARA)**:

   * Escolha novamente entre as moedas disponíveis.
3. **Inserir Valor**:

   * Digite o valor a ser convertido.
4. **Resultado**:

   * O programa exibirá o valor convertido com base na taxa mais recente.

## Tecnologias Utilizadas

* **Java**: Lógica principal do programa.
* **Gson**: Desserialização do JSON da API.
* **HttpClient**: Requisições HTTP nativas do Java 11+.
* **ExchangeRate-API**: Fonte das taxas de câmbio.

## Estrutura do Projeto

* **Main.java**: Classe principal, gerencia o fluxo.
* **Menu.java**: Exibe o menu de seleção de moedas.
* **ConexaoApi.java**: Faz a requisição à API.
* **ApiResponse.java**: Modelo para mapear resposta da API.
* **Moedas.java**: Estrutura com as taxas de câmbio.

## Como Executar o Projeto

1. **Clone o repositório**:

   ```bash
   git clone git@github.com:Douglas-Perez/currency-converter-ONE.git
   ```
2. **Adicione o Gson ao classpath** ou configure no Maven/Gradle.
3. **Compile**:

   ```bash
   javac -cp ".:gson-2.10.1.jar" src/*.java
   ```
4. **Execute**:

   ```bash
   java -cp ".:gson-2.10.1.jar:src" Main
   ```

## Observações

* Substitua a chave de API no `ConexaoApi.java` por sua chave pessoal obtida em [ExchangeRate-API](https://www.exchangerate-api.com/).

## Licença

Este projeto é de uso livre.
