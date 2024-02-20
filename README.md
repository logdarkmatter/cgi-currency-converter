# CGI & IST Currency Exchange API


![Logo](https://seeklogo.com/images/C/cgi-group-inc-logo-ADDFE73AD0-seeklogo.com.png)


## About The Project

The CGI & IST Currency Exchange API is an innovative tool designed to facilitate the real-time conversion of currencies across the globe. Leveraging state-of-the-art technology, this API aims to provide users with accurate and up-to-date currency exchange rates, ensuring that businesses, travelers, and financial analysts have access to reliable financial data whenever they need it.

## Tecnologias Utilizadas

O projeto CGI & IST Currency Exchange API foi desenvolvido utilizando as seguintes tecnologias:

- Java 17
- Spring Framework
- Maven

## Instalação com Maven

Para compilar e instalar o projeto, é recomendado usar o Maven. Certifique-se de ter o Maven instalado em seu sistema e execute o seguinte comando na raiz do projeto:

```bash
mvn clean install
```

## Instalação

Aceder ao github:
[CGI Currency Converter](https://github.com/logdarkmatter/cgi-currency-converter)

```bash
  ## HTTPS
  git clone https://github.com/logdarkmatter/cgi-currency-converter.git
```

```bash  
  ## SSH
  git clone git@github.com:logdarkmatter/cgi-currency-converter.git  
```

## Documentação da API

#### Retorna todos os quotes


```http
  GET /api/currency-converter/currency-quotes
```

Response Body:
```http
[SGD, MYR, EUR, USD, AUD, JPY, CNH, HKD, CAD, INR, DKK, GBP, RUB, NZD, MXN, IDR, TWD, THB, VND]
```

#### Guarda currency

```http
  GET /api/currency-converter/save
```
Request Body:
```json
{
  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
  "createdBy": "string",
  "createdAt": "2024-02-20T20:19:29.009Z",
  "updatedBy": "string",
  "updatedAt": "2024-02-20T20:19:29.009Z",
  "name": "string",
  "code": "string",
  "rate": 0,
  "new": true
}
```
## Acesso ao Swagger
O Currency Exchange API vem com uma interface Swagger embutida para facilitar a visualização e interação com os endpoints da API. Para aceder ao Swagger, siga estas etapas:

- Inicie o servidor da API localmente.
- Abra um navegador da web e vá para o seguinte URL: http://localhost:8080/swagger-ui/index.html.
- Isso abrirá a interface do Swagger, onde você poderá visualizar todos os endpoints disponíveis, os seus detalhes, parâmetros e exemplos de requests e responses.
## Exercícios

### 1. Implementação de Novo Endpoint

Um dos endpoints está em falta na API. Este endpoint permitirá a conversão das moedas.

#### Descrição do Endpoint Ausente:

- **Endpoint**: `https://currency-exchange.p.rapidapi.com/exchange`
- **Parametros Obrigatórios**: `from` e `to`
- **Exemplo de Uso**: `GET https://currency-exchange.p.rapidapi.com/exchange?from=SGD&to=MYR`
- **Resposta Esperada**: `3.5571034420000003`

#### Detalhes da Implementação:

Este endpoint deve aceitar dois parametros obrigatórios: `from` e `to`, que representam as moedas de origem e destino, respetivamente. O endpoint deve consultar a API RapidAPI para obter a taxa de troca entre as duas moedas especificadas e retornar o resultado.

- **Ajuda: Ver a implementação feita no `getCurrencyQuotesList()`**

### 2. Conclusão do Método `createCurrency`

O método `createCurrency` na API está incompleto e precisa ser finalizado. 
Este método é responsável pela criação de uma nova moeda no sistema (Base de Dados & API).

#### Descrição do Método Incompleto:

```java

@Override
public Optional<CurrencyDTO> createCurrency(CurrencyDTO currencyDTO) {
    List<String> currencyQuotesList = getCurrencyQuotesList();

    if (!currencyQuotesList.contains(currencyDTO.getCode())) {
        throw new CurrencyQuoteNoteFound(CurrencyConverterErrorsEnum.ERR001_INVALID_QUOTE);
    }

    CurrencyEntity savedEntity = currencyRepository.saveAndFlush(new CurrencyEntity(currencyDTO));
    return Optional.of(new CurrencyDTO(savedEntity));
}
```
**Tarefas a Serem Completadas:**
- Verificar se a moeda fornecida (currencyDTO.getCode()) está presente na lista de quotes de moedas disponíveis.
- Evitar a adição de moedas duplicadas, verificando assim se a moeda já existe no sistema antes de salvar.
- Concluir a implementação do método para salvar a nova moeda na base de dados.
