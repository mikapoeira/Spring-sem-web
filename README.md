# 📺 SCREENMATCH

## Sobre o Projeto

Screenmatch é um aplicativo desenvolvido em **Java** com **Spring Boot** que consome a API do OMDB para obter informações sobre séries e filmes. 
O projeto utiliza **Jackson (ObjectMapper)** para conversão de JSON e segue boas práticas de arquitetura.

##Estrutura do projeto
```sh
screenmatch/
 ├── src/main/java/br/com/alura/screenmatch/
 │   ├── model/
 │   │   ├── DadosSerie.java
 │   ├── service/
 │   │   ├── ConsumoApi.java
 │   │   ├── ConverteDados.java
 │   │   ├── IConverteDados.java
 │   ├── ScreenmatchApplication.java
 ├── pom.xml (caso use Maven)
 ├── build.gradle (caso use Gradle)
```
## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## ▶️ Como Rodar o Projeto

### 1️⃣ Clone o Repositório
```sh
git clone https://github.com/seu-usuario/screenmatch.git
cd screenmatch
```

### 2️⃣ Instale as Dependências
```sh
mvn clean install
```

### 3️⃣ Execute o Projeto
```sh
mvn spring-boot:run
```

## 🔍 COMO FUNCIONA
### 1️⃣ Obtenção de Dados da API

A classe ConsumoApi faz uma requisição HTTP para a API do OMDB e retorna os dados em formato JSON.

### 2️⃣ Conversão do JSON para um Objeto Java

A classe ConverteDados usa ObjectMapper para transformar o JSON recebido em um objeto do tipo DadosSerie.

### 3️⃣ Execução no Terminal

A classe principal ScreenmatchApplication executa esses passos e exibe os resultados no terminal.

## 📌 EXEMPLO DE SAÍDA
```sh
{"Title":"Breaking Bad","Year":"2008–2013","imdbRating":"9.5"}
DadosSerie{titulo='Breaking Bad', ano='2008–2013', avaliacao=9.5}
```

## ⚙️ PERSONALIZAÇÃO

Se quiser buscar outra série ou filme, basta alterar a URL na linha:
```sh
var json = consumoApi.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=526600ac");
```
Substitua breaking+bad pelo nome do filme/série desejado.

## 📝 LICENÇA
Este projeto é de livre uso para estudos e aprendizagem.
